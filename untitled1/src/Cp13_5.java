import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Cp13_5 extends JFrame {
    MyPanel mp = new MyPanel();
    int x,y;

    public Cp13_5(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);
        setLayout(new BorderLayout());
        y= 375;
        x=400;
        mt m = new mt();
        m.start();
        mp.setFocusable(true);

        mp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    mt2 m2 = new mt2();
                   m2.start();
                }
            }
        });
        add(mp);

        setVisible(true);
    }
    class MyPanel extends JPanel{

        public void paintComponent(Graphics g){
            setSize(400,500);
            super.paintComponent(g);
            g.fillRect(x,0,50,50);
            g.fillRect(190,380,20,20);
            setVisible(true);
            g.setColor(Color.RED);
            g.fillRect(195,y,10,10);
        }
    }
    class mt extends Thread{
        public void run(){
            try {
                while (true){
                    x-=5;
                    if(x<0){
                        x=400;
                    }
                    repaint();
                    sleep(20);
                }
            }
            catch (Exception e){return;}
        }
    }
    class mt2 extends Thread{
        public void run(){
            try {
                while (true){
                    y-=5;
                    if(x<=200&&x>=190&&y>=0&&y<=50){
                        x= 400;
                        y=375;
                        interrupt();

                    }
                    if (y==0) {
                        y=375;
                        interrupt();
                    }
                    repaint();
                    sleep(20);
                }
            }
            catch (InterruptedException e){return;}
        }
    }

    public static void main(String [] args){
        new Cp13_5();
    }
}
