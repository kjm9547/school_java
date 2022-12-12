package cp14;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cp14_2 extends JFrame {
    ImageIcon icon;
    mp m = new mp();
    String pathName;
    public Cp14_2(){
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(m);
        JMenuBar jb = new JMenuBar();
        JMenu file = new JMenu("파일");
        JMenuItem open = new JMenuItem("open");
        jb.add(file);
        file.add(open);
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser= new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("png","png");
                chooser.setFileFilter(filter);
                int ret = chooser.showOpenDialog(null);

                if(ret == JFileChooser.APPROVE_OPTION){
                     pathName =chooser.getSelectedFile().getPath();
                    String fileName = chooser.getSelectedFile().getName();

                    repaint();
                }
            }
        });
        setJMenuBar(jb);

    }
    class mp extends JPanel{
        public void paintComponent(Graphics g){
            icon = new ImageIcon(pathName);
            Image img = icon.getImage();
            g.drawImage(img,0,0,400,500,this
            );
        }
    }
    public static void main(String []args){
        new Cp14_2();
    }

}
