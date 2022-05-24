package CP3;
interface Shape{
	final double PI = 3.14;
	void draw(); //도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("---다시 그립니다.");
		draw();
	}
}
class Circle implements Shape{
	int r;
	public Circle(int n) {
		r =n;
	}
	public void draw() {
		System.out.print("반지름이 "+r+" 인 원 입니다.\n" );
	}
	public double getArea() {
		return r*r*PI;
	}
}
public class cp_5_14 {
	public static void main(String []args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.print("면적은 " + donut.getArea());
	}
}
