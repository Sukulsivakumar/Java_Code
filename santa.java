package basics;
import java.util.*;
public class santa{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// names
		int b=sc.nextInt();
		String a[] = new String[b];
		for(int i=0;i<b;i++){
		    a[i]=sc.next();
		}
		// gifts
		int n=sc.nextInt();
		// initial names
		String x=sc.next();
		String y=sc.next();
		int c= (int)x.charAt(0);
		int d= (int)y.charAt(0);
		if(c<d){
		    System.out.println("Clock wise");
		}
		else{
		    System.out.println("Anti clock wise");
		    int q=0;
		    while(q<b){
		    for(int i=b-1;i>=0;i--){
		        a[q]=a[i];
		        q++;
		    }
		}
		}
		
		int k[]=new int[b];
		for(int i=0;i<b;i++){
		    k[i]=0;
		}
		 int l=0;
		 int j=0;
		 int g=1;
		while(l<n){
		    if((b%2==0)&&(l<n)){
		        j=0;
		    }
		    
		    for(int i=j;i<b;i+=2){
		        if(l<n){
		        k[i]=k[i]+1;
		        l++;
		    }
		    }
		    if((b%2==1)&&(l<n)){
		        if(g%2==1){
		        j=1;
		        g++;
		    }
		    else{
		        j=0;
		        g++;
		    }
		    }
		    }
		    
		   
		    int arr[]=new int [b];
		     int p=0;
		    for(int i=0;i<b;i++){
		        int t=0;
		        for(int f=0;f<b;f++){
		            if(k[i]>=k[f]){
		                t++;
		            }
		        }
		        if(t==b){
		            arr[p]=i;
		            p++;

		        }
		    }
		
		for(int i=0;i<p;i++){
                int h=arr[i];
		    System.out.print(a[h]+" ");
		    System.out.print(k[h]+" ");
		    System.out.println();
		}
		
	
	}
}