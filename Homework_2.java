package homework_1;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class Homework_2 extends JFrame{
	private JTextArea text = new JTextArea(10,10);
	public Homework_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		createMenu(); 
		c.add(text);
		setSize(350,200);
		setVisible(true);
	}
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openitem = new JMenuItem("Open");
		JMenuItem saveitem = new JMenuItem("Save");
		openitem.addActionListener(new OpenActionListener());
				// TODO 자동 생성된 메소드 스텁
		saveitem.addActionListener(new SaveActionListener());		
		fileMenu.add(openitem);
		fileMenu.add(saveitem);
				
				mb.add(fileMenu); setJMenuBar(mb);
			
		
	}
	class OpenActionListener implements ActionListener{
		private JFileChooser chooser;
		public OpenActionListener() {
			chooser = new JFileChooser();
		}
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter =
					new FileNameExtensionFilter("txt", "txt");
					chooser.setFileFilter(filter);
					int ret = chooser.showOpenDialog(null);
					if(ret != JFileChooser.APPROVE_OPTION) { JOptionPane.showMessageDialog(null,
					"파일을 선택하지 않았습니다", "경고",
					JOptionPane.WARNING_MESSAGE);
					return;
		
					}
					
					String filePath = chooser.getSelectedFile().getPath();
					File f = new File(filePath);
					String n="";
					try {
					FileReader filereader = new FileReader(f);
					 int singleCh = 0;
					 while((singleCh = filereader.read()) != -1){
						 n+=(char)singleCh;
					 }
					text.setText(n);
					}
					catch(Exception q) { System.out.println();}
		}
	}
	class SaveActionListener implements ActionListener{
		private JFileChooser chooser;
		public SaveActionListener() {
			chooser = new JFileChooser();
		}
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter =
					new FileNameExtensionFilter("txt", "txt");
					chooser.setFileFilter(filter);
					int ret = chooser.showOpenDialog(null);
					if(ret != JFileChooser.APPROVE_OPTION) { JOptionPane.showMessageDialog(null,
					"파일을 선택하지 않았습니다", "경고",
					JOptionPane.WARNING_MESSAGE);
					return;
		
					}
					
					String filePath = chooser.getSelectedFile().getPath();
					File f = new File(filePath);
					String n="";
					try {
						OutputStream output = new FileOutputStream(f);
						String str =text.getText();
					    byte[] by=str.getBytes();
					    output.write(by);
					}
					catch(Exception q) { System.out.println();}
		}
	}
	public static void main(String[]args) {
		new Homework_2();
	}
	
}
