package bk;
class Circle{
	int x,y,radius;
	public Circle(int x, int y,int radius) {
		this.x =x;
		this.y= y;
		this.radius = radius;
	}
	public Boolean equals(Circle b) {
		if(x == b.x && y == b.y)
			return true;
		else
			return false;
	}
	public String toString() {
		return "Circle"+x+','+y+"반지름"+radius;
	}
}

public class cp_6_2 {
	public static void main(String []args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a :" +a.toString());
		System.out.println("원 b :" +b.toString());
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}
