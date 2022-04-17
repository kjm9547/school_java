package CP3;
class TV{
	String name;
	int year;
	int size;
	public TV(String name,int year,int size) {
		this.name = name;
		this.year = year;
		this.size =size;
	}
	public void show() {
		System.out.print(name+year+size);
	}
		
}
public class cp4_1 {
	public static void main(String[] srg) {
		TV a = new TV("lg",2007,32);
		a.show();
	}
}
