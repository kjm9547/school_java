package cp8;

import java.io.*;

public class Test2 {
    public static void main(String []args){
       // File f = new File("C:\\Users\\user\\Desktop\\phone.txt");
        FileReader fr = null;
        System.out.println("eqwe");
        FileWriter fw = null;
        try {
            //System.out.println(f);
            fr = new FileReader("C:\\Users\\user\\Desktop\\phone.txt");
            fw = new FileWriter("C:\\Users\\user\\Desktop\\그래프.txt");
            int c;
            char b;
            String a;
            System.out.println(fr.read());
            while ((c=fr.read())!=-1){
                b = (char)c;

                if(Character.isLowerCase(b)==true){
                    System.out.println(Character.toUpperCase(b));
                    fw.write(Character.toUpperCase(b));
                    //fw.write("aser",0,5);
                }
            }
            fr.close();
            fw.close();
        }
        catch (IOException e){
            System.out.println("qq");}
    }
}
