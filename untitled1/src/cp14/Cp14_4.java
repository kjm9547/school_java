package cp14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Cp14_4 extends JFrame {
    public Cp14_4(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setLayout(new BorderLayout());
        JToolBar jtb = new JToolBar();
        JLabel num = new JLabel("학번");
        JTextField jtf = new JTextField(10);
        jtf.setFocusable(true);
        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if(!Character.isDigit(e.getKeyChar())){
                    JOptionPane.showMessageDialog(null,"거 잘 못 입력 했수다","error",JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
                else {


                }

            }
        });
        jtb.add(num);
        jtb.add(jtf);
        add(jtb,BorderLayout.SOUTH);
        setVisible(true);
    }
    public static void main(String []args){
        new Cp14_4();
    }
}
