package cp5_calendar;
import java.util.Calendar;
public class cp_5_5 {
	public static void main(String []args) {
		Calendar now = Calendar.getInstance();
		System.out.println("현재 시간은"+now.get(Calendar.HOUR)+"시"+now.get(Calendar.MINUTE)+"분입니다.");
		if(now.get(Calendar.AM_PM)==1) {
			System.out.println("오후");
		}
		else {
			System.out.println("오전");
		}
	}
}
