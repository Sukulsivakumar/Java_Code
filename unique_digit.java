package basics;

import java.util.Scanner;

public class unique_digit {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		int num1=num;
		int n=0;
		while(num>0) {
			int k=num%10;
			num/=10;
			n++;
		}
		int[] a=new int[n];
		num=num1;
		int i=0;
		while(num>0) {
			int l= num%10;
			a[i]=l;
			i++;
			num/=10;
			
		}
		int count=0;
		int t[]=new int[n];
		int k=0;
		for(int i1=0;i1<n;i1++){
		    int f=0;
		    for(int j=0;j<k;j++){
		    if(t[j]==a[i1]){
		        f=1;
		        break;
		        }
		    }
		        if(f==0)
		        t[k++]=a[i1];
		    }
		    for(int i1=0;i1<k;i1++)
		    {
		       count++;
		    }
		    System.out.print(count);
	}
	

}
