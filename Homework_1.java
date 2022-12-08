package homework_1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;


class Dscanner extends JDialog{
	JButton signal = new JButton("scan");
	JTextField inputName = new JTextField(10);
	JTextField inputPoint = new JTextField(10);
	String name,point;
	int v = 0;
	public Dscanner(JFrame jframe, String title) {
		super(jframe, title,true);
		setLayout(new GridLayout(3, 1));
		setSize(300,300);
		

		add(inputName);
		add(inputPoint);
		
		signal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 자동 생성된 메소드 스텁
				name = inputName.getText();
				point = inputPoint.getText();
				if(name.equals("stop")) {System.exit(0);}
				setVisible(false);
			}
		});
		add(signal);
		
		
	}
	public String getname() {
		return name;
	}
	
public String getpoint() {
		return point;
	}
	
}
public class Homework_1 {
	public static void main(String []args) {
		System.out.println("** point handling program **");
		HashMap<String,String> map5 = new HashMap<>();
		JFrame j = new JFrame();
		Dscanner d =new Dscanner(j,"");
		while(true) {
			System.out.println("input name and point");
			d.setVisible(true);
			
			map5.put(d.getname(), d.getpoint());
			System.out.println(map5);
			
	}
}
}
