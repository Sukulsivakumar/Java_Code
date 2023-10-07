package basics;

import java.util.Scanner;

public class sum_even_index {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int c=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(i%2==0){
				count=count+arr[i];
			}
		}
		System.out.print(count);
	}
}
