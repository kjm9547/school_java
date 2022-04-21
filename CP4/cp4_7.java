package CP3;
import java.util.Scanner;
class Day{
	private String work;
	public void set(String work) { this.work = work;};
	public String get() { return work;}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
	
}
class MonthSchedule {
	Scanner s = new Scanner(System.in);
	Day d[];
	public MonthSchedule(int days) {
		d = new Day[days];
		for(int i =0; i<d.length;i++) {
			d[i] = new Day();
		}
	}
	public void input() {
		int num;
		System.out.print("날짜를 입력해주세요");
		num = s.nextInt();
		String today_work = s.next();
		d[num].set(today_work);
		
	}
	public void show() {
		System.out.print("날짜(1~30)?");
		int days = s.nextInt();
		d[days].show();
	}
	public void finish() {
		System.out.print("종료합니다.");
		System.exit(0);
	}
	public void run() {
			System.out.print("이번달 스케쥴 관리 프로그램");
			while(true) {
				System.out.print("할일(입력:1, 보기:2, 끝내기:3)");
				int user_press = s.nextInt();
				switch(user_press) {
				case 1:
				{
					input();
					break;
				}
				case 2:
				{
					show();
					break;
				}
				case 3:
				{
					finish();
					break;
				}
				}
			}
		}
	}

public class cp4_7 {
	public static void main(String[]args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();

	}
}
