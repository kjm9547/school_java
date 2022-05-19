package cp_4_12;

class Km2Mile extends Converter{
	public Km2Mile(double n) { ratio = n;}
	protected String getSrcString() {return "Km";}
	protected String getDestString() { return "Mile";}
	protected double convert(double src) {return src/ratio;}
}
public class cp_5_4 {
	public static void main(String []args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();	
	}
}
