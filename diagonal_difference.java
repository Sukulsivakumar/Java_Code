package basics;
import java.util.*;
public class diagonal_difference
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int m=0;
		int n=0;
		int a[][]=new int[b][b];
		
		for(int i=0;i<b;i++){
		    for(int j=0;j<b;j++){
		    a[i][j]=sc.nextInt();
		}
		}
		for(int i=0;i<b;i++){
		    for(int j=i;j<b;j++){
		    if(i==j){
		      m=m+a[i][j];  
		   }
		    if((i+j)==b-1){
		    	n+=a[i][j];
		    }
		}
	}
		System.out.println(m); 
		System.out.println(n);
		
		if(m<n) {
			System.out.println(n-m); 
		}
		else if(m>n) {
			System.out.println(m-n); 
		}
		else if(m==n) {
			System.out.println(m-n); 
		}
	}
	}