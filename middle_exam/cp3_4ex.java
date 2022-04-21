package CP3;
import java.util.Scanner;
public class cp3_4ex {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ют╥б");
		String word = s.next();
		char end_word = word.charAt(0);
		for(char i=end_word;i>='a'; i--) {
			for(char y='a'; y<=i;y++) {
				System.out.print(y);
			}
			System.out.println();
		}
	}
}
