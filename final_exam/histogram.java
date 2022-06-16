package histogram;
import java.util.Scanner;
class histo{
	String readString() {
		StringBuffer sb =new StringBuffer();
		Scanner s = new Scanner(System.in);
		while(true) {
			String line = s.nextLine();
			if(line.equals(";")) {
				break;
			}
			sb.append(line);
		}
		s.close();
		return sb.toString();
	}
	void run() {
		String text = readString();
		String array[] = new String[26];
		for(int i=0; i<26;i++) {
			array[i] = "";
		}
		text = text.toLowerCase();
		for(char c ='a';c<='z';c++) {
			for(int i =0; i<text.length();i++) {
				if(text.charAt(i)==c) {
					array[c-97] += "-";
				}
			}
		}
		System.out.println("������׷��� �׸��ϴ�.");
		for(char i='a';i<='z';i++) {
			System.out.println(i+array[i-97]);
		}
	}
}
public class histogram {
	public static void main(String []args) {
		System.out.println("���� �ؽ�Ʈ�� �Է��ϰ� �����ݷ��� �Է��ϼ���.");
		histo h = new histo();
		h.run();
	}
}
