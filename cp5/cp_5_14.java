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
public class cp_5_14 {
	public static void main(String []args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.print("������ " + donut.getArea());
	}
}
