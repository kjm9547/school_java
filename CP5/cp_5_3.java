package cp_4_12;
import java.util.Scanner;
abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "��" + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�.");
		scanner.close();
	}
}

class Won2Dollar extends Converter{
	public Won2Dollar(double num) {ratio = num;}
	protected String getSrcString() {return "��";}
	protected String getDestString() {return "�޷�";}
	protected double convert(double src) {return src/ratio;}
	
}
public class cp_5_3 {
	public static void main(String []args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();	
	}
}