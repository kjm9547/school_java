import javax.swing.*;
import java.awt.*;

public class Cp12_9 extends JFrame {

    public Cp12_9(){
        setSize(500,500);
        setVisible(true);
        BlueLabel b = new BlueLabel("big Hello");
        b.setOpaque(true);
        b.setBackground(Color.cyan);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(b);

    }

    class BlueLabel extends JLabel{
        public BlueLabel(String s){
            super(s);
        }
        @Override
        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            setBackground(Color.BLUE);
            //repaint();

        }

    }
    public static void main(String []args){
        new Cp12_9();
    }
}
