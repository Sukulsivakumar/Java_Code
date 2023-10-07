package basics;

import java.util.Scanner;

public class count_of_non_repeat {
public static void main(String args[]) {
	Scanner s= new Scanner(System.in);
	int num= s.nextInt();
	int num1=num;
	int n=0;
	while(num>0) {
		int k=num%10;
		num/=10;
		n++;
	}
	int[] arr=new int[n];
	num=num1;
	int i=0;
	while(num>0) {
		int l= num%10;
		arr[i]=l;
		i++;
		num/=10;
		}
	int count =0;
	for(int i1=0;i1<n;i1++) {
		int f=0;
		int c=0;
		c=arr[i1];
		for(int j=0;j<n;j++) {
			if(c==arr[j]) {
				f++;
			}
			
		}
		if(f==1) {
			count++;
		}
	}
	System.out.print(count);
	}
}
