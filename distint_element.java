package basics;
import java.util.*;
public class distint_element {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int f=0;
			int c=0;
			c=arr[i];
			for(int j=0;j<n;j++) {
				if(c==arr[j]) {
					f++;
				}
				
			}
			if(f==1) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	}