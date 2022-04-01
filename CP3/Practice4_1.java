package CP3;
import java.util.Scanner;
import java.util.Random;
public class Practice4_1 {
	public static void main(String[] arg) {
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
		int array[] = new int[size];
		Random ran_num;
		for(int i = 1; i <= size; i++) {
			ran_num = new Random();
			int ran = ran_num.nextInt(0,100);
			array[i-1] = ran;
			
			System.out.print(array[i-1]+" ");
			if(i%10==0) {
				System.out.print("\n");
			}
			
		}
	}
}
