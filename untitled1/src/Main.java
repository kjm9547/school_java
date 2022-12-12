import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    MyPanel mp = new MyPanel();
    public Main(){
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(mp);
    }
    class MyPanel extends  JPanel{
        int x;int y;
        public void paintComponent(Graphics g){
              super.paintComponent(g);
              g.setColor(Color.black);
              x = this.getWidth()/10;
              y  = this.getHeight()/10;
              for(int i =1; i<10;i++){
                  g.drawLine(0,y*i,this.getWidth(),y*i);
              }
            for(int i =1; i<10;i++){
                g.drawLine(x*i,0,x*i,this.getHeight());
            }


        }
    }
    public static void main(String[] args) {
            new Main();

    }
}