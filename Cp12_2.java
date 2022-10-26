package cp12;
import javax.swing.*;

import com.sun.tools.javac.Main;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Cp12_2 extends JFrame{
	MyPanel panel = new MyPanel();
	public Cp12_2() {
		setTitle("이미지 위 원 드래깅 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(400,450);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("images/enayng.png");
		Image img = icon.getImage();
		int x,y;
		 public void paintComponent(Graphics g) {
			 super.paintComponent(g);
			 Container c = getContentPane();
			 g.drawImage(img, x, y, getWidth(), getHeight(),this);
			 addMouseListener(new MouseAdapter() {
				 public void mouseDragged(MouseEvent e) {
					 x = e.getX();
					 y = e.getY();
					 repaint();
				 }
			 
			 });
			 g.setColor(Color.GREEN);
			 g.fillOval(x,y,20,20);
		 }
	}
	
	public static void main(String [] args) {
		new Cp12_2();
	}
}
