package CP3;

class ArrayUtil{
	public static int [] concat(int[]a, int []b) {
		int size = a.length+b.length;
		int n_array[] = new int[size];
		for(int i=0; i< a.length; i++) {
			n_array[i] = a[i];
		}
		int index =(a.length);
		for(int i=index; i <index+b.length; i++) {
			n_array[i] = b[i-index];
		}
		return n_array;
	}
	public static void print(int[]a) {
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]);
		}
	}
}
public class cp4_6 {
	public static void main(String[] args) {
		int []array1 = {1,5,7,9};
		int []array2 = {3,6,-1,100,7};
		int []array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
		
	}
}
