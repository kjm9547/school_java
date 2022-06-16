package cp_5_12;
import java.util.Scanner;
abstract class Shape{
	private Shape next;
	public Shape() { next =null;}
	public void setNext(Shape obj) {next = obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
class GraphicEditor{
	Shape head,tail;
	void run() {
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("그래픽 에디터를 실행합니다.");
		while(true) {
			System.out.print("삽입(1) 삭제(2) 모두보기(3) 종료(4)");
			n = s.nextInt();
			switch(n) {
			case 1:
				System.out.print("Line(1) Rect(2) Circle(3)");
				n=s.nextInt();
				if(n==1) {
					Shape sp = new Line();
					if(head == null) {
						head = sp;
						tail = sp;
					}
					else {
						tail.setNext(sp);
						tail = sp;
					}
				}
				else if(n==2) {
					Shape sp = new Rect();
					if(head == null) {
						head = sp;
						tail = sp;
					}
					else {
						tail.setNext(sp);
						tail = sp;
					}
				}
				else if(n==3) {
					Shape sp = new Circle();
					if(head == null) {
						head = sp;
						tail = sp;
					}
					else {
						tail.setNext(sp);
						tail = sp;
					}
				}
				
				break;
			case 2:
				if(head == tail) {
					head = null;
					tail =null;
				}
				else {
					head = head.getNext();
				}
				break;
			case 3:
				Shape sp = head;
				while(sp != null) {
					sp.draw();
					sp = sp.getNext();
				}
				break;
			case 4:
				System.exit(0);
				break;
			}
		}
		
		
	}
}
public class cp_5_12 {
	public static void main(String[] args) {
		GraphicEditor g = new GraphicEditor();
		g.run();
	}
}
