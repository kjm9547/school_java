import java.util.Scanner;
public class practice_3 {
	public static void main(String []arg) {
		Scanner s = new Scanner(System.in);
		
		int a,b,c;
		
		a= s.nextInt();
		b= s.nextInt();
		c= s.nextInt();
		
		int middle=0;
		if(a>b&&b>c) {
			
			middle = b;
		}
		if(b>a&&a>c) {
			middle =a;
		}
		if(a>c&& c>b) {
			middle =c;
		}
		
		System.out.println(middle);
	}
}
