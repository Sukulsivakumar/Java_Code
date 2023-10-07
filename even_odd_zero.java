package basics;
import java.util.*;
public class even_odd_zero {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int count =0;
		int c=0;
		int arr[] = new int[n];
		int arr2[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}		
		for(int k=0;k<n;k++) {
			if(arr[k]%2==0 && arr[k]!=0) {
				arr2[count]=arr[k];
				count++;
			}
		}
		for(int k=0 ;k<n;k++) {
			if(arr[k]%2!=0 && arr[k]!=0) {
				arr2[count]=arr[k];
				count++;
			}
			}
		for(int i=0;i<n;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
