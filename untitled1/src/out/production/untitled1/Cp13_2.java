package out.production.untitled1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Cp13_2 extends JFrame {
    int x1,y1=0;
    Mypanel mp = new Mypanel();
    public Cp13_2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        add(mp);
        mp.setVisible(false);
        setVisible(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mp.setVisible(true);
                Thread t =new thread();
                t.start();
            }
        });
    }
    class Mypanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawOval(x1,y1,50,50);
        }
    }
    class thread extends Thread{
        public void run(){
            try {
                while (true) {
                    System.out.println("rrrrr");
                    x1 = (int) (Math.random() * 300);
                    y1 = (int) (Math.random() * 300);
                    repaint();
                    sleep(500);
                }
            }
            catch (Exception e){return;}
        }
    }
    public static void main(String []args){
        new Cp13_2();
    }
}
