package cp10;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.*;
public class Cp10_7 extends JFrame {
	JLabel jl;
	Font f;
	public Cp10_7() {
		setTitle("onWheel mouse change text size");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		jl = new JLabel("Love Java");
		add(jl);
		jl.addMouseWheelListener(new MouseWheelListener() {
		int size =0;
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {//익명 클래
				f=jl.getFont();
				size = f.getSize();
				// TODO 자동 생성된 메소드 스텁
				int n = e.getWheelRotation();
				if(n<0) {
					jl.setFont(new Font("Arial",Font.PLAIN,size+5));
				}
				else {
					jl.setFont(new Font("Arial",Font.PLAIN,size-5));
				}
			}
		});
		
		setVisible(true);
		jl.requestFocus();
	}
	
	public static void main(String [] args) {
		new Cp10_7();
	}
	
}
