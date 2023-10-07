package basics;
import java.util.*;
public class sum_of_array {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++) {
			c=c+arr[i];
		}
		System.out.print("Sum of Arrays:"+c);
}
}