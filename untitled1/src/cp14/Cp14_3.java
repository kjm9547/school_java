package cp14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cp14_3 extends JFrame {
    public Cp14_3(){
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToolBar jtb = new JToolBar("exit");
        JButton exit =new JButton("hi");
        jtb.add(exit);
        exit.setToolTipText("종료");
      String qq =  JOptionPane.showInputDialog("qq");
        System.out.println(qq);
      exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null,"종료?","exit",JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.CLOSED_OPTION){

                } else if (result ==JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
                else{

                }
            }
        });
        jtb.setFloatable(false);
        setLayout(new BorderLayout());
        add(jtb,BorderLayout.NORTH);
        setVisible(true);
    }
    public static void main(String[] args ){
        new Cp14_3();
    }
}
