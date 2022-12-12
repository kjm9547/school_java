import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Vector;

public class Cp13_8 extends JFrame {
    JLabel jl = new JLabel("");
    Vector<Point> snowVector = new Vector<Point>();
    mp m = new mp();
    public Cp13_8(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);
        setLayout(null);
        m.setBounds(0,0,400,500);
        add(m);
        for(int i =0; i<50;i++){
            Point p = new Point((int) (Math.random() * 400),(int) (Math.random() * 400));
            System.out.println(p);
            snowVector.add(p);
            mt m = new mt(jl,snowVector,i);
            m.start();
        }
        setVisible(true);
    }
    class mp extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            setBackground(Color.BLACK);

            g.setColor(Color.WHITE);
            for(int i=0;i<snowVector.size();i++){
                Point p = snowVector.get(i);
                g.fillOval(p.x,p.y,10,10);
            }
        }
    }

    class mt extends Thread{
        JLabel jl;
        Point p;
        public mt(JLabel jl,Vector<Point> v,int i){
            this.jl = jl;
            this.p = v.get(i);
        }
        public void run(){
            try{
                while (true) {
                    if(p.y>500){
                        p.y=0;
                    }
                    System.out.println(p);
                    p.y +=5;
                    jl.setLocation(p.x, (int) p.y);
                    sleep(100);
                    repaint();
                }
            }
            catch (InterruptedException e){return;}

        }
    }
    public static void main(String []args){
        new Cp13_8();
    }
}
