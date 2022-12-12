package cp8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cp8_10 {
    public static void main(String []args){
        Scanner s =new Scanner(System.in);
        System.out.println("전화번호 입력 프로그램입니다.");
        String t1 = "";
        String t2 = "";
        s.next();
        FileWriter fw=null;
        try {
            fw= new FileWriter("C:\\Users\\user\\Desktop\\phone.txt");
            FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\phone.txt");
            while (true){
                System.out.println("name    number>>");
                t1 = s.next();
                t2 = s.next();
                if(t1.equals("그만")){
                    break;
                }


                fw.write(t1 + t2,0,t1.length()+t2.length());
            }
            fw.close();
            int c;
            while ((c =fr.read())!= -1){
                System.out.println((char)c);
            }
            fr.close();
        }


        catch (IOException e){
            System.out.println("fail");
        }
    }
}
