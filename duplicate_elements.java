package basics;
import java.util.*;
public class duplicate_elements {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			int c=0;
			for(int j=i;j<n;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
		}
			if(c<1) {
				System.out.print(arr[i]);
			}
		}
	}
}