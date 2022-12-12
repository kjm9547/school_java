import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Cp12_11 extends JFrame {
    String fluit[] = {"apple","cherry","strawberry","prune"};
    int value[]= new int [4];
    MyPanel mp = new MyPanel();
    int rate[] = new int[4];
    public Cp12_11(){
        setTitle("draw pie");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel head = new JPanel();
        JPanel body = new JPanel();

        head.setLayout(new FlowLayout());
        JTextField jt[] = new JTextField[4];
        JLabel jl[] = new JLabel[4];
        JLabel result[] = new JLabel[4];

        for(int i =0; i<4;i++){
            jt[i] = new JTextField(5);
            jl[i] = new JLabel(fluit[i]);
            jt[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int n =0;
                        for(int i=0;i<4;i++){
                            value[i]=Integer.valueOf( jt[i].getText());
                            n+= value[i];
                        }
                        for(int i=0; i<4;i++){
                            rate[i] = (int)((value[i]/(double)n)*100);
                            result[i].setText(""+rate[i]);
                        }

                    repaint();
                }
            });
            result[i] = new JLabel(fluit[i]);
            head.add(jt[i]);
            head.add(jl[i]);
            mp.add(result[i]);

        }
        head.requestFocus();
        head.setFocusable(true);
        //body.add(mp);

        c.add(head,BorderLayout.NORTH);
        c.add(mp,BorderLayout.CENTER);
        setVisible(true);
    }
    class MyPanel extends JPanel{
        @Override

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            int x = getWidth()/4;
            int y = getWidth()/5;
            setSize(500,500);
            setBackground(Color.yellow);
            g.setColor(Color.RED);
            g.fillArc(x, y, 200, 200, 0, rate[0]);
            g.setColor(Color.BLUE);
            g.fillArc(x, y, 200, 200, rate[0], rate[1]);
            g.setColor(Color.MAGENTA);
            g.fillArc(x, y, 200, 200, rate[0] + rate[1], rate[2]);
            g.setColor(Color.YELLOW);
            g.fillArc(x, y, 200, 200, rate[0] + rate[1] + rate[2], rate[3]);



        }
    }
    public static void main(String []args){
        new Cp12_11();
    }
}
