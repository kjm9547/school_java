package cp11;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
public class Cp11_2 extends JFrame{
	public Cp11_2() {
		setSize(400,300);
		setTitle("input combobox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JTextField jf = new JTextField(10);
		JComboBox<String> jcb = new JComboBox<String>();
		
		
		jf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO 자동 생성된 메소드 스텁
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO 자동 생성된 메소드 스텁
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO 자동 생성된 메소드 스텁
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {

					String add_item = jf.getText();
					jcb.addItem(add_item);	
				}
			}
		});
		
		c.add(jf);
		c.add(jcb);
		c.requestFocus();
		
		setVisible(true);
	}
	public static void main(String args[]) {
		new Cp11_2();
	}
}
