import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cp13_10 extends JFrame {
    mp p = new mp();
    int x,y,w,h;
    mt t = new mt();
    public Cp13_10(){
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        p.setBounds(0,0,400,300);
        add(p);

        t.start();
        p.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                t.startC();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                t.stopC();

            }
        });
    }
    class mp extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            setBackground(Color.GREEN);
            g.setColor(Color.WHITE);
            g.drawOval(x,y,w,h);
        }
    }
    class mt extends Thread{
        Object obj = new Object();
        boolean state = false;
        public void stopC(){
            state=false;

        }
        synchronized public void startC(){
            state=true;
            this.notify();
        }
        public void run(){
            try {
                while (true){
                    if(!state) {
                        try {
                            //synchronized (t) { }
                               synchronized (this){this.wait();}

                        } catch (InterruptedException d) {
                            return;
                        }
                    }
                    x=(int)(Math.random()*200);
                    y=(int)(Math.random()*150);
                    w=(int)(Math.random()*200);
                    h=(int)(Math.random()*200);
                    repaint();
                    System.out.println(state);
                    sleep(300);

                }
            }catch (InterruptedException e){return;}

        }
    }

    public static void main(String []args){
        new Cp13_10();
    }
}
