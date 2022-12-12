package cp14;

import javax.swing.*;

public class Cp14_1  extends JFrame {
    public Cp14_1(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("메뉴 만들기");
        setSize(300,200);
        JMenuBar jb = new JMenuBar();
        JMenu file =new JMenu("File");
        jb.add(file);
        JMenuItem load = new JMenuItem("Load");
        file.add(load);

        JMenu setting =new JMenu("setting");
        jb.add(setting);

        JMenu view =new JMenu("view");
        jb.add(view);
        JMenuItem maximum = new JMenuItem("max");
        view.add(maximum);
        JMenuItem min = new JMenuItem("min");
        view.add(min);

        JMenu input =new JMenu("input");
        jb.add(input);

        setJMenuBar(jb);
        setVisible(true);
    }
    public static void main(String []args){
        new Cp14_1();
    }
}
