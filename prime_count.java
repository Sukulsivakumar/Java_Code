package basics;

import java.util.Scanner;

public class prime_count {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int c=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=2;j<=arr[i];j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}
			if(count==1) {
				c++;
			}
		}
		System.out.print(c);
	}
}