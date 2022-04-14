package cp_4_12;
import java.util.Scanner;
class User{
	String name;
	int index;
	public User(int n) { index = n;}
	public void setInfo(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

class Seat{
	int index;
	String name;
	String seat[] = new String[10];
	public Seat(int n) {index =n;};
	public void setName(String name) {
		this.name = name;
	}
	public void setSeat() {
		for(int i=0; i<10; i++) {
			seat[i] = "---";
		}
	}
	public void getSeat() {
		System.out.print(name);
		for(int i =0; i<10;i++) {
			System.out.print(seat[i]+" ");
		}
		System.out.print("\n");
	}
	public void setArray(int num,String name) {
		seat[num] = name;
	}
}

class Base{
	
	Seat value[]; 
	User user_info[] = new User[30];
	int index=0;
	public Base() {
		value =new Seat[3];
		for(int i=0; i<3; i++) {
			value[i] = new Seat(i);
		}
		for(int i=0; i<30; i++) {
			user_info[i] = new User(i);
			
		}
		value[0].setName("S");
		value[1].setName("A");
		value[2].setName("B");
		value[0].setSeat();
		value[1].setSeat();
		value[2].setSeat();
	}
	public void setUser(String user_name,int reser_num,int index) {
	
		user_info[index].setInfo(user_name);
		value[index].setArray(reser_num,user_name);
		
		index++;
	}
	
	public void show() {
		value[0].getSeat();
		value[1].getSeat();
		value[2].getSeat();
	}
	public void show_line(int num) {
		value[num-1].getSeat();
	}
	public void del_name(String name) {
		for(int i=0; i<30; i++) {
			if(user_info[i].getName().equals(name)==true) {
				user_info[i].setInfo("---");
			}
		}
	}
};




public class Concert {
	public static void main(String[] arg) {
		Base concert = new Base();
		System.out.println("명픔콘서트홀 예약 시스템입니다.");
		Scanner s = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("예약:1, 조회2:, 취소:3, 끝내기:4>>");
			num = s.nextInt();
			if(num==4) {
				break;
			}
			switch(num) {
				case 1:
					String name;
					int reserv_num;
					System.out.println("좌석 구분 S(1) A(2) B(3)");
					num = s.nextInt();
					switch(num) {
						case 1:
							System.out.println("이름");
							name = s.next();
							System.out.println("번호");
							reserv_num = s.nextInt();
							concert.setUser(name,reserv_num,0);
							
							break;
						case 2:
							System.out.println("이름");
							name = s.next();
							System.out.println("번호");
							reserv_num = s.nextInt();
							concert.setUser(name,reserv_num,1);
							
							break;
						case 3:
							System.out.println("이름");
							name = s.next();
							System.out.println("번호");
							reserv_num = s.nextInt();
							concert.setUser(name,reserv_num,2);
							break;
					}
					break;
				case 2:
					concert.show();
					break;
				case 3:
					System.out.println("좌석 S:1, A:2, B:3");
					num = s.nextInt();
					String input_user_name;
					switch(num) {
						case 1:
							
							concert.show_line(num);
							System.out.print("이름");
							input_user_name= s.next();
							concert.del_name(input_user_name);
							break;
						case 2:
							concert.show_line(num);
							System.out.print("이름");
							input_user_name= s.next();
							concert.del_name(input_user_name);
							break;
						case 3:
							concert.show_line(num);
							System.out.print("이름");
							input_user_name= s.next();
							concert.del_name(input_user_name);
							break;
								
							
					}
					break;
					
			}
			
		}
		
	}	
}

