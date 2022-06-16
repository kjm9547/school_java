package cp7_10;
import java.util.Vector;
import java.util.Scanner;
abstract class Shape{
	abstract void draw();
}
class Line extends Shape{
	void draw() {System.out.println("Line");
}
}
class Rect extends Shape{
	void draw() {System.out.println("Rect");
}
}
class Circle extends Shape{
	void draw() {System.out.println("Circle");
}
}
public class cp7_10 {
	public static void main(String []args) {
		Vector<Shape> v= new Vector<Shape>();
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		Shape shape;
		int n;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("����(1) ����(2) ��κ���(3) ����(4)>>");
			n = s.nextInt();
			if(n==1) {
				System.out.println("Line(1) Rect(2) Circle(3)>>");
				n = s.nextInt();
				if(n==1) {
					v.add(new Line());
				}
				else if(n==2) {
					shape = new Rect();
					v.add(shape);
				}
				else if(n==3) {
					shape = new Circle();
					v.add(shape);
				}
			}
			else if(n==2) {
				System.out.println("������ ������ ��ġ");
				n =s.nextInt();
				if(v.size() == 0 || v.size()<n) {
					System.out.println("���� �� �� �����ϴ�.");
				}
				else {
					v.remove(n-1);
				}
			}
			else if (n==3) {
				for(int i=0;i<v.size();i++) {
					v.get(i).draw();
				}
				
			}
			else if(n==4) {
				s.close();
				return;
			}
		}
	}
}
