import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class cp12_7 extends JFrame {
    MyPanel mp = new MyPanel();
    //Image img =new ImageIcon("button.png");
    public cp12_7(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        setContentPane(mp);


    }
    class MyPanel extends  JPanel
    {

        int p;
        Vector<Point> v = new Vector<Point>();
        int i=0;
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.black);

            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    v.add(e.getPoint());
                    repaint();
                }
            });
            int x[] = new int [v.size()];
            int y[] = new int [v.size()];
            for(int i =0; i<v.size();i++){
                Point p = v.elementAt(i);
                x[i] = (int)p.getX();
                y[i]=(int)p.getY();
            }
            g.drawPolygon(x,y,v.size());


           // g.drawImage(img,10,20,this);
        }
    }
    public static void main(String []args){
        new cp12_7();
    }
}
