package CP3;
import java.util.Random;
public class practice4_2 {
public static void main (String[] arg) {
	int array[][] = new int [4][4];
	Random ran = new Random();

	int r=0;
	int cnt=0;
	while(cnt<=9) {
		int x =ran.nextInt(0,4);//·£´ý ÀÎµ¥½º
		int y =ran.nextInt(0,4);
		if(array[x][y]==0) {
			cnt++;	
			r =ran.nextInt(1,10);
				array[x][y]=r;
				
			}	
		}
	for(int i=0; i<4; i++) {
		for(int j=0; j<4; j++) {
			System.out.print(array[i][j]+" ");
			}
		System.out.print("\n");
		}
	}
}
