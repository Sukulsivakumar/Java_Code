package basics;

import java.util.Scanner;

public class number_power {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int c=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int a,b;
		for(int i=0;i<n;i++) {
			int m=1;
			a=arr[i];
			b=arr[i];
			while(b>0) {
				m=m*a;
				b--;
			}
			c=c+m;
			
		}
		System.out.print(c);
	}
}
