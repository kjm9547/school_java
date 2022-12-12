import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cp14_6 extends JFrame {
    int a,b;
    JLabel jl;
    public Cp14_6(){
        JFrame j = this;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,400);
        jl =new JLabel("결과값");
        JButton jb = new JButton("calculate");
        setLayout(null);
        jb.setBounds(20,10,100,30);
        jl.setBounds(120,10,100,30);
        add(jb);
        add(jl);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calDial c = new calDial(j,"");
                c.setVisible(true);
            }
        });
    }
    class calDial extends JDialog{
        public calDial(JFrame j,String title){
            super(j,"",true);
            setSize(300,300);
            JTextField first = new JTextField(10);
            JTextField second = new JTextField(10);
            JButton run =new JButton("add");
            setLayout(null);
            first.setBounds(10,10,100,30);
            add(first);
            second.setBounds(10,50,100,30);
            add(second);
            run.setBounds(10,70,70,30);
            add(run);
            run.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    a = Integer.parseInt(first.getText());
                    b = Integer.parseInt(second.getText());
                    jl.setText(a+b+"");
                    setVisible(false);
                }
            });

        }
    }
    public static void  main(String []args){
        new Cp14_6();
    }
}
