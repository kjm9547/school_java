package CP3;
import java.util.Scanner;
public class cp3_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int array[] = new int[10];
		for(int i=0; i<array.length;i++) {
			int input = s.nextInt();
			array[i] = input;
			if(array[i]%3 == 0) {
				System.out.print(array[i]+"  ");
			}
		}
	}
}
