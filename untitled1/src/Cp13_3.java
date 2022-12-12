import out.production.untitled1.Cp13_2;

import javax.swing.*;
import java.util.Calendar;


public class Cp13_3 extends JFrame {
    int hour;
    int min;
    int second;
    String timeText="";
    JLabel label = new JLabel(timeText);
    public Cp13_3(){
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(label);
        mt t = new mt();
        t.start();


        setVisible(true);
    }
    class mt extends Thread{

        public void run(){


                try {
                    while (true) {Calendar c = Calendar.getInstance();
                        System.out.println("#3333");
                        hour = c.get(Calendar.HOUR);
                        min = c.get(Calendar.MINUTE);
                        second = c.get(Calendar.SECOND);
                        System.out.println(second);
                        timeText = hour + ":" + min + ":" + second;
                        label.setText(timeText);
                        sleep(1000);
                    }


                } catch (Exception e) {
                    return;
                }

        }
    }
    public static void main(String []args){
        new Cp13_3();
    }
}
