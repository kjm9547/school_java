package cp5_calendar;
import java.util.Calendar;
public class cp_5_5 {
	public static void main(String []args) {
		Calendar now = Calendar.getInstance();
		System.out.println("���� �ð���"+now.get(Calendar.HOUR)+"��"+now.get(Calendar.MINUTE)+"���Դϴ�.");
		if(now.get(Calendar.AM_PM)==1) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
	}
}
