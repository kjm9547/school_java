import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cp13_6 extends JFrame {

    mt m;

    JLabel t;
    public Cp13_6(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);
        setLayout(null);
       addMouseListener(new MouseAdapter() {
           int i=0;
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                t=new JLabel("hi");
                t.setLocation(e.getX(),e.getY());
                t.setSize(40,30);
                add(t);

                m= new mt(t);;
                m.start();
                i++;
            }
        });

        setVisible(true);
    }


    class mt extends Thread{
        JLabel t;
        public mt(JLabel t){
            this.t=t;
        }
        public void run(){
            try {
                while (true){
                    System.out.println("ee");
                    if(t.getY()<0){
                        t.setVisible(false);
                        remove(t);
                        this.interrupt();}
                    t.setLocation(t.getX(),t.getY()-5);
                    repaint();
                    sleep(20);
                }
            }
            catch (InterruptedException e){return;}
        }
    }
    public static void main(String []args){
        new Cp13_6();
    }
}
