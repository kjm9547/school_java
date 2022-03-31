import java.util.Scanner;
public class practice_4 {
	public static void main(String []arg) {
		Scanner s = new Scanner(System.in);
		
		int num;
		
		num= s.nextInt();
		int ten,one;
		int stack=0;
		ten = num/10;
		one = num%10;
		String clap ="";
		if(ten !=0) {
		if(ten%3 == 0) {
			stack++;
		}
		}
		if(one%3 ==0) {
			stack++;
		}
		for(int i=0; i<stack;i++) {
			clap+="¦";
		}
		System.out.println(clap);
		
	}
}
