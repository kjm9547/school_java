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

class Oval implements Shape{
	int width,height;
	public Oval(int x,int y) {width =x;height = y;}
	public void draw() {
		System.out.println(width +"x" + height + "에 내접하는 타원입니다." );
	}
	public double getArea() {
		return width*height*PI;
	}
}
class Rect implements Shape{
	int x,y;
	public Rect(int a,int b) {x=a;y=b;}
	public void draw() {
		System.out.println(x+"x"+y+"크기의 사각형 입니다.");
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
		for(int i=0; i<list.length;i++) System.out.println("면적은"+list[i].getArea());
	}
}
