package scanner;
import java.util.*;
public class cp6_11 {
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		StringBuffer sb = new StringBuffer(text);
		System.out.println("명령");
		String search = s.next();
		StringTokenizer st = new StringTokenizer(search,"!");
		String first_tk =st.nextToken();
		String second_tk =st.nextToken();
		
		if(text.indexOf(first_tk)!=1) {
			text =text.replace(first_tk,second_tk);
			System.out.println(text);
		}
		else {
			System.out.println("잘못된 명령입니다.");
		}
	}
}
