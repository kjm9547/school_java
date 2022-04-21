package CP3;
import java.util.Scanner;
class Day{
	private String work;
	public void set(String work) { this.work = work;};
	public String get() { return work;}
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
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
		System.out.print("��¥�� �Է����ּ���");
		num = s.nextInt();
		String today_work = s.next();
		d[num].set(today_work);
		
	}
	public void show() {
		System.out.print("��¥(1~30)?");
		int days = s.nextInt();
		d[days].show();
	}
	public void finish() {
		System.out.print("�����մϴ�.");
		System.exit(0);
	}
	public void run() {
			System.out.print("�̹��� ������ ���� ���α׷�");
			while(true) {
				System.out.print("����(�Է�:1, ����:2, ������:3)");
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
