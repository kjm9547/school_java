package practice;
import java.util.Scanner;
public class RSP {
public static void main(String[] arg) {
	
		String str[] ={"����","����","��"};
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int n = (int)(Math.random()*3);
			System.out.println("����������!");
			String user = s.next();
			
			String cpu =" ";
			if(user.equals("�׸�")) {
				System.out.print("������ �����մϴ�...");
				break;
			}
		switch(n) {
			case 0://����
				cpu = str[0];
				
				if(user.equals(cpu)) {
					System.out.print("����ڴ�");
					System.out.print(user);
					
					System.out.print(" ��ǻ�ʹ�");
					System.out.print(cpu);
					
					System.out.println("�����ϴ�");
					
				}
				else if(user.equals("��")){
					System.out.print("����ڴ�");
					System.out.print(user);
					
					System.out.print(" ��ǻ�ʹ�");
					System.out.print(cpu);
					
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
					
				}
				else if(user.equals("����")){
					System.out.print("����ڴ�");
					System.out.print(user);
					
					System.out.print(" ��ǻ�ʹ�");
					System.out.print(cpu);
					
					System.out.println("����ڰ� �̰���ϴ�");
					
				}
				break;
			case 1://����
				cpu = str[1];

				if(user.equals(cpu)) {
					System.out.print("����� = ");
					System.out.print(user);
					
					System.out.print(" ��ǻ�� = ");
					System.out.print(cpu);
					
					System.out.println("�����ϴ�");
					
				}
				else if(user.equals("��")){
					System.out.print("����� = ");
					System.out.print(user);
					
					System.out.print(" ��ǻ�� = ");
					System.out.print(cpu);
					
					System.out.println("����ڰ� �̰���ϴ�");
					
				}
				else if(user.equals("����")){
					System.out.print("����� = ");
					System.out.print(user);
					
					System.out.print(" ��ǻ�� = ");
					System.out.print(cpu);
					
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}
			case 2:
				cpu = str[2];

				if(user.equals(cpu)) {
					System.out.print("����� = ");
					System.out.print(user);
					
					System.out.print(" ��ǻ�� = ");
					System.out.print(cpu);
					
					System.out.println("�����ϴ�");
					
				}
				else if(user.equals("����")){
					System.out.print("����� = ");
					System.out.print(user);
					
					System.out.print(" ��ǻ�� = ");
					System.out.print(cpu);
					
					System.out.println("����ڰ� �̰���ϴ�");
					
				}
				else if(user.equals("����")){
					System.out.print("����� = ");
					System.out.print(user);
					
					System.out.print(" ��ǻ�� = ");
					System.out.print(cpu);
					
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				
			}
			
	
			}
		

	}
		s.close();
	
}
}
