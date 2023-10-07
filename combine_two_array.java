package basics;
import java.util.*;
public class combine_two_array {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter size of arr 1: ");
		int n= s.nextInt();
		int arr1[] = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=s.nextInt();
		}
		System.out.print("Enter size of arr 2: ");
		int m= s.nextInt();
		int arr2[] = new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=s.nextInt();
		}
		int b=m+n;
		int arr3[] = new int[b];
			int i=0;
			int j=0;
			for(j=0;i<n;j++) {
				arr3[i]=arr1[j];
				i++;
			}
			for(int k=0;k<m;k++) {
				arr3[i]=arr2[k];
				i++;
			}
		for(i=0;i<b;i++) {
			System.out.print(arr3[i]+" ");
			
		}
		
	}
}