package scanner;
import java.util.*;
public class cp6_12 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�׺� ���ӿ� ������ ���� ����>>>");
		int size = s.nextInt();
		String user[]=new String[size];
		for(int i=0;i<user.length;i++) {
			System.out.println(i+"��° ������ �̸�>>");
			user[i] = s.next();
		}
		Random r = new Random();
		int num_ar[] = new int[3];
		
		while(true) {
			for(int i=0; i<user.length;i++) {
				System.out.println(user[i]+"<enter>");
				s.nextLine();
					for(int y=0;y<3;y++) {
						num_ar[y] = r.nextInt(1,3);
					}
					if(num_ar[0]==num_ar[1]&&num_ar[1]==num_ar[2]) {
						for(int z=0; z<3;z++) {
							System.out.print(num_ar[z]);
						}
						System.out.println(user[i]+"�� �̰���ϴ�.");
						return;
					}
					else {
						for(int z=0; z<3;z++) {
							System.out.print(num_ar[z]);
						}
						System.out.println("�ƽ�����");
					}	
			}
		}
	}
}
