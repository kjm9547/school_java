package practice;
import java.util.Scanner;
public class RSP {
public static void main(String[] arg) {
	
		String str[] ={"가위","바위","보"};
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int n = (int)(Math.random()*3);
			System.out.println("가위바위보!");
			String user = s.next();
			
			String cpu =" ";
			if(user.equals("그만")) {
				System.out.print("게임을 종료합니다...");
				break;
			}
		switch(n) {
			case 0://가위
				cpu = str[0];
				
				if(user.equals(cpu)) {
					System.out.print("사용자는");
					System.out.print(user);
					
					System.out.print(" 컴퓨터는");
					System.out.print(cpu);
					
					System.out.println("비겼습니다");
					
				}
				else if(user.equals("보")){
					System.out.print("사용자는");
					System.out.print(user);
					
					System.out.print(" 컴퓨터는");
					System.out.print(cpu);
					
					System.out.println("컴퓨터가 이겼습니다");
					
				}
				else if(user.equals("바위")){
					System.out.print("사용자는");
					System.out.print(user);
					
					System.out.print(" 컴퓨터는");
					System.out.print(cpu);
					
					System.out.println("사용자가 이겼습니다");
					
				}
				break;
			case 1://바위
				cpu = str[1];

				if(user.equals(cpu)) {
					System.out.print("사용자 = ");
					System.out.print(user);
					
					System.out.print(" 컴퓨터 = ");
					System.out.print(cpu);
					
					System.out.println("비겼습니다");
					
				}
				else if(user.equals("보")){
					System.out.print("사용자 = ");
					System.out.print(user);
					
					System.out.print(" 컴퓨터 = ");
					System.out.print(cpu);
					
					System.out.println("사용자가 이겼습니다");
					
				}
				else if(user.equals("가위")){
					System.out.print("사용자 = ");
					System.out.print(user);
					
					System.out.print(" 컴퓨터 = ");
					System.out.print(cpu);
					
					System.out.println("컴퓨터가 이겼습니다");
				}
			case 2:
				cpu = str[2];

				if(user.equals(cpu)) {
					System.out.print("사용자 = ");
					System.out.print(user);
					
					System.out.print(" 컴퓨터 = ");
					System.out.print(cpu);
					
					System.out.println("비겼습니다");
					
				}
				else if(user.equals("가위")){
					System.out.print("사용자 = ");
					System.out.print(user);
					
					System.out.print(" 컴퓨터 = ");
					System.out.print(cpu);
					
					System.out.println("사용자가 이겼습니다");
					
				}
				else if(user.equals("바위")){
					System.out.print("사용자 = ");
					System.out.print(user);
					
					System.out.print(" 컴퓨터 = ");
					System.out.print(cpu);
					
					System.out.println("컴퓨터가 이겼습니다");
				
			}
			
	
			}
		

	}
		s.close();
	
}
}
