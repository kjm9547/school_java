package practice_java_2;

class Rectangles{
	int x,y,width,height;
	int square() {
		return width*height;
	};
	void show() {
	
		System.out.println("("+x+","+y+")"+"���� ũ�Ⱑ "+ width+ "x" + height +" �� �簢��");
	};
	
	boolean contains(Rectangles r) {
		if(x<r.x) {
			return true;
		}
		else {
			return false;
		}
		

	};
	public Rectangles(int a, int b, int c, int d) {
		x=a;
		y=b;
		width=c;
		height =d;
	}
}
public class Rectangle {
	public static void main (String[] arg){
		
		Rectangles r = new Rectangles(2,2,8,7);
		Rectangles s = new Rectangles(5,5,6,6);
		Rectangles t = new Rectangles(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������" + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
		
	}
}
