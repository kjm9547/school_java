import java.util.Scanner;
public class pracitce_2 {
public static void main(String []arg) {
	Scanner s = new Scanner(System.in);
	int money = s.nextInt();
	int a,b,c,d,e,f,g;
	
	
	if(money/50000 >=1) {
		a= money/50000;
		money -= a*50000;
		System.out.println("��������"+ a);
	}
	if(money/10000 >=1) {
		b= money/10000;
		money -= b*10000;
		System.out.println("������"+ b);
	}
	if(money/1000>=1) {
		c= money/1000;
		money -= c*1000;
		System.out.println("õ��"+ c);
	}
	if(money/100>=1) {
		d= money/100;
		money -= d*100;
		System.out.println("���"+ d);
	}if(money/50>=1) {
		e= money/50;
		money -= e*50;
		System.out.println("���ʿ�"+ e);
	}
	if(money/10>=1) {
		f= money/10;
		money -= f*10;
		System.out.println("�ʿ�"+ f);
	}
	if(money/1>=1) {
		g= money/1;
		money -= g*1;
		System.out.println("�Ͽ�"+g );
	}
	
	
	
}
}
