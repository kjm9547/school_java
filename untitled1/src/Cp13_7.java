import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Cp13_7 extends JFrame {
    Vector<JLabel> v = new Vector<JLabel>();
    mp m = new mp();
    public Cp13_7(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);
        for(int i =0; i<10;i++){
            JLabel jl = new JLabel();
            jl.setSize(20,20);
            jl.setBackground(Color.black);
            jl.add(jl);
        }
        add(m);
        setBackground(Color.BLUE);
        setVisible(true);
    }
    class mp extends  JPanel{
        public void paintComponent(Graphics g){

        }
    }
    class th extends Thread{

    }
    public static void main(String [] args){
        new Cp13_7();
    }
}
