package cp5_1;
import java.util.Random;
import java.lang.Math;
class M{
	int a;
	int b;
	public M(int a ,int b) {
		this.a=a;this.b = b;
	}
	public String toString(){
		return "M은 " +a+b;
	}
	public boolean equals(M m) {
		if(a==m.a && b==m.b) {
			return true;
		}
		else
			return false;
	}
}
public class cp5_1 {
	public static void main(String []args) {
		
		double ran = (int)(Math.random()*100+1);
		System.out.println(ran);
		Random r = new Random();
		int n = r.nextInt(1,100);
		System.out.println(n);
		M p = new M(4,50);
		M q = new M(4,50);
		System.out.println(p);
		if(p.equals(q)) {
			System.out.println("같");
		}
		else {
			System.out.println("다르");
		}
	}
}
