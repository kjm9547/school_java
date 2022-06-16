package scanner;
import java.util.Scanner;
import java.util.StringTokenizer;
public class cp6_7 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		System.out.println(text);
		s.close();
		StringTokenizer st =new StringTokenizer(text," ");
		System.out.println("어절의 수는"+st.countTokens());
		String array[] = text.split(" ");
		;
		System.out.println(array.length);   
	}
}
