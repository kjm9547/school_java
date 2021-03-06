package cp_4_12;
class Point{
	private int x, y;
	public Point(int x,int y) {this.x = x; this.y= y;}
	public int getX() { return x;}
	public int getY() {return y;}
	protected void move(int x ,int y) { this.x =x; this.y =y;}
}
class Point3D extends Point{
	int z;
	public Point3D(int a, int b ,int c) {
		super(a,b);
		z= c;
	}
	public void moveup() {
		z++;
	}
	public void movedown() {
		z--;
	}
	public void move(int x,int y,int z) {
		super.move(x, y);
		this.z = z;
	}
	public String toString() {
		return "("+getX()+","+getY()+","+z+")의 점";
	}
}
public class cp5_7 {
	public static void main(String []args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");

		p.moveup();
		System.out.println(p.toString()+"입니다.");
		
		p.movedown();
		p.move(10, 10);
		System.out.print(p.toString() + "입니다.");
		
		p.move(100,200,300);
		System.out.print(p.toString()+"입니다.");
	}
}
