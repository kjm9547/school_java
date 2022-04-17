package CP3;
import java.util.Scanner;
class Grade{
	int math;
	int science;
	int english;
	public Grade(int a, int b, int c) {
		math = a;
		science = b;
		english = c;
	}
	int average() {
		return (math+science+english)/3;
	}
}
public class cp4_2 {
	public static void main(String[] str) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("수학 과학 영어 순으로 3개의 점수 입력>>");
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		Grade me = new Grade(math,science,english);
		
		System.out.print(me.average());
		s.close();
	}
}
