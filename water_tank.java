package basics;

import java.util.Scanner;

public class water_tank {
public static void main(String args[]) {
	Scanner s= new Scanner(System.in);
	int a= s.nextInt();
	int arr[]= new int[a];
	for(int i=0;i<a;i++) {
		arr[i]=s.nextInt();
	}
	int m=0;
	for(int i=0;i<a;i++) {
		if(m<arr[i]) {
			m=arr[i];
		}
	}
	int sum=0;
	for(int i=0;i<a;i++) {
		if(arr[i]<m) {
		sum=sum+(m-arr[i]);
		}
	}
	System.out.print(sum);
}
}
