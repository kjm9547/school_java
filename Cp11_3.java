package cp11;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Cp11_3 extends JFrame{
	public Cp11_3() {
		setSize(400,500);
		setTitle("on click visble");
		FlowLayout g = new FlowLayout(FlowLayout.CENTER);
		
		setLayout(g);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		String txt[] = {"오만원","만원","천원","500원","100원","50원","10원","1원"};
		int value[] = {50000,10000,1000,500,100,50,10,1};
		
		JLabel won[] = new JLabel[txt.length]; 
		JLabel head = new JLabel("금액");
		JTextField jf = new JTextField(10);
		JButton jb = new JButton("계산");
		JTextField inin_box[] = new JTextField[txt.length];
		
		
		c.add(head);
		c.add(jf);
		c.add(jb);
		for(int i=0;i<txt.length;i++) {
			won[i]= new JLabel(txt[i]);
			inin_box[i]=new JTextField(10);
			c.add(won[i]);
			c.add(inin_box[i]);
		}
			jb.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO 자동 생성된 메소드 스텁
					int sum =0;
					for(int i =0;i<txt.length;i++) {
						sum +=Integer.parseInt(inin_box[i].getText())*value[i];
					}
					jf.setText(Integer.toString(sum));
				}
			});
		setVisible(true);
	}
	public static void main(String []args) {
		new Cp11_3();
	}
}
