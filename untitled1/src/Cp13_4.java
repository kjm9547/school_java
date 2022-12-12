import javax.swing.*;

public class Cp13_4 extends JFrame {
    int x,y =0;
    JLabel label = new JLabel("JLable");
    public Cp13_4(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        mt m = new mt();
        m.start();
        label.setLocation(50,50);
        add(label);
        setVisible(true);
    }
    class mt extends Thread{
        int i =0;
        public void run(){
            try {
                while (true){
                    if(i%2 == 0){
                        x+=5;
                        y+=5;
                        label.setLocation(x,y);
                        i++;

                    }
                    else{
                        x-=5;
                        y-=5;
                        label.setLocation(x,y);
                        i++;
                    }
                    sleep(100);
                }


            }
            catch (Exception e){

            }
        }
    }
    public static void main(String []args){
        new Cp13_4();
    }
}
