package cp14;

import javax.swing.*;
import javax.swing.text.html.Option;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.OpenType;

public class test extends JFrame {
    public test(){
        setSize(300,200);
        JMenuBar tb = new JMenuBar();
        Container c = getContentPane();
        JMenu test1 = new JMenu("test1");
        JMenu test2 = new JMenu("test2");
        JMenu test3 = new JMenu("test3");
        tb.add(test1);
        tb.add(test2);
        tb.add(test3);


        JMenuItem info = new JMenuItem("1111");
        JMenuItem info2 = new JMenuItem("2222");
        JMenuItem info3 = new JMenuItem("3333");
        JMenuItem info4 = new JMenuItem("4444");

        test1.add(info);
        test1.add(info2);
        test1.add(info3);
        test1.add(info4);
        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog("");
            }
        });

        info4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(c,"","hi", JOptionPane.WARNING_MESSAGE);
            }
        });
        info3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(c,"","qew",JOptionPane.YES_NO_OPTION);
            }
        });
        info2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog("");
            }
        });
        setJMenuBar(tb);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[]args){
        new test();
    }
}
