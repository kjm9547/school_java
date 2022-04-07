package practice;
import java.util.Scanner;
class Phone{
	String name;
	String number;
	int index;
	public Phone(int n) {index =n;}
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	void setNumber(String num) {
		number = num;
	}
	String getNumber() {
		return number;
	}
}
class PhoneBook{
	int size;
	Phone p[];
	Scanner s = new Scanner(System.in);
	
	public PhoneBook(int size) {
		this.size = size;
		};
		
	public void setting() {
		String input_name;
		String user_number;
		 p= new Phone[size];
		for(int i=0; i<p.length; i++) {
			p[i] = new Phone(i);
			System.out.print("입력");
			
			input_name =s.next();
			user_number =s.next();
			
			p[i].setName(input_name);
			p[i].setNumber(user_number);

		}
		System.out.println(p[0].getName());
		System.out.println(p[1].getName());
		System.out.println(p[2].getName());
	};
	public void search_user(){

		while(true) {
			System.out.print("검색할 이름");
			String s_name = s.next();
			int cnt=0;
			if(s_name.equals("그만")) {
				break;
			}

			
			for(int i=0; i< p.length; i++) {
				if(p[i].getName().equals(s_name)) {
					System.out.print(p[i].getName()+" 의 번호는" + p[i].getNumber()+ "입니다.");
				
				}

			}
			for(int i=0; i< p.length; i++) {
				
				if(p[i].getName().equals(s_name)==false) 
				{
					cnt++;
					
			
				}
				
			}
			if(cnt == size) {
				System.out.print( s_name+ "이 없습니다.");
			}
			
		
		};
		s.close();
		
	}
}
public class cp4_8 {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		PhoneBook Ph_b= new PhoneBook(size);  
		
		Ph_b.setting();
		Ph_b.search_user();
		
		s.close();
	}

}
