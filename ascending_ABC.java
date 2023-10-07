package basics;

import java.util.Scanner;

public class ascending_ABC {
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int num =s.nextInt();
	int[] a= new int[num];
//	char[] arr= new char[num];
//	arr=s.next().toCharArray();
	
	for(int i=0;i<num;i++) {
		a[i]= s.nextInt();
	}
	for(int j=0;j<num;j++) {
		System.out.print(a[j]+" ");
	}
	}
}
