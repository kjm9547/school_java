package CP3;
interface Shape{
	final double PI = 3.14;
	void draw(); //������ �׸��� �߻� �޼ҵ�
	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�
	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("---�ٽ� �׸��ϴ�.");
		draw();
	}
}
class Circle implements Shape{
	int r;
	public Circle(int n) {
		r =n;
	}
	public void draw() {
		System.out.print("�������� "+r+" �� �� �Դϴ�.\n" );
	}
	public double getArea() {
		return r*r*PI;
	}
}

class Oval implements Shape{
	int width,height;
	public Oval(int x,int y) {width =x;height = y;}
	public void draw() {
		System.out.println(width +"x" + height + "�� �����ϴ� Ÿ���Դϴ�." );
	}
	public double getArea() {
		return width*height*PI;
	}
}
class Rect implements Shape{
	int x,y;
	public Rect(int a,int b) {x=a;y=b;}
	public void draw() {
		System.out.println(x+"x"+y+"ũ���� �簢�� �Դϴ�.");
	}
	public double getArea() {
		return x*y;
	}
}
public class cp_5_14 {
	public static void main(String []args) {
		Shape []list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,40);
		
		for(int i=0;i<list.length;i++) list[i].redraw();
		for(int i=0; i<list.length;i++) System.out.println("������"+list[i].getArea());
	}
}
