import java.util.Scanner;

import static java.lang.Thread.sleep;

class MyThread implements Runnable{
    int i = 0;
    public void run(){
        while (i<10){

            System.out.println(i);
            i++;
            try {
                sleep(1000);
            }
            catch (InterruptedException e){
                return;
            }
        }
    }
}
public class Cp13_1{
    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("아무 키나 입력");
        n = s.nextInt();
        Thread m = new Thread(new MyThread());
        m.start();
    }
}
