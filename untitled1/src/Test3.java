import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 extends JFrame {
    JLabel jl = new JLabel("test");
    public Test3(){
        setSize(300,150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JButton st = new JButton("start");
        JButton stop = new JButton("stop");

        jl.setOpaque(true);
        add(jl);
        add(st);
        add(stop);
        mt m = new mt();
        m.start();
        st.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.rthread();

            }
        });
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.stThread();
            }
        });
    }
    class mt extends Thread{
        boolean flag = false;
       synchronized public void rthread(){
            flag = true;
            this.notify();
        }
       public void stThread(){
            flag=false;
        }
        public void run(){
            int i=0;
            try {
                while (true){
                    if(!flag) {
                        synchronized (this) {
                            try {
                                this.wait();
                            }catch (InterruptedException e){return;}
                        }
                    }
                        if (i % 2 == 0) {
                            jl.setBackground(Color.GREEN);
                        } else {
                            jl.setBackground(Color.YELLOW);
                        }
                        i++;
                        sleep(100);
                    }
                }


            catch (InterruptedException e){return;
            }
        }
    }
    public static void main(String []args){
        new Test3();
    }
}
