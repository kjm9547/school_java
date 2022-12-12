import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cp13_9 extends JFrame {
    JLabel text[] = new JLabel[3];
    int n[] = new int[3];
    JLabel result = new JLabel("start");
    mt th;
    public Cp13_9(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setLayout(null);
        for(int i =0; i<3 ;i++){
            text[i] = new JLabel("0");

            text[i].setBackground(Color.GREEN);
            text[i].setForeground(Color.black);
            text[i].setBounds(20+i*70,150,70,30);
            add(text[i]);
        }
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                th = new mt();
                th.start();
                th.startgambling();
            }
        });
        result.setBounds(170,220,70,30);
        add(result);
        setVisible(true);
    }
    class mt extends Thread{
        boolean gambling =false;
        synchronized public void waitForgambling(){
            if(!gambling)try {
                this.wait();
            }
            catch (InterruptedException e){return;}
        }
        synchronized public void startgambling(){
            gambling = true;
            this.notify();
        }
        public void run(){
            try {


                while (true) {
                    waitForgambling();
                    System.out.println("3333333");
                    for (int i = 0; i < 3; i++) {
                        n[i] = (int) (Math.random() * 4);
                        text[i].setText(n[i]+"");
                        sleep(200);
                    }
                    if(n[0]==n[1]&& n[1]==n[2]){result.setText("success");}
                    else {result.setText("아숩아숩");}
                    gambling = false;
                }
            }
            catch (InterruptedException e){return;}
        }
    }
    static void test(){
        boolean b = false;
        if(!b) System.out.println("eee");
        else System.out.println("www");

    }
    public static void main(String []args){
        new Cp13_9();
        test();
    }
}
