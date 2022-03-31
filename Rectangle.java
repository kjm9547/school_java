package practice_java_2;

class Rectangles{
	int x,y,width,height;
	int square() {
		return width*height;
	};
	void show() {
	
		System.out.println("("+x+","+y+")"+"에서 크기가 "+ width+ "x" + height +" 인 사각형");
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
		System.out.println("s의 면적은" + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
		
	}
}
