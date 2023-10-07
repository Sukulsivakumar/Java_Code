package basics;
import java.util.Scanner;
public class sub_sequence {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		String a= Integer.toString(num);
		int l=a.length();
		int arr[]= new int[l];
		int i=0;
		while(num>0) {
			int k=num%10;
			arr[i]=k;
			i++;
			num/=10;
		}
		i=0;
		int b[]=new int[l];
		for(int j=l-1;j>=0;j--) {
			b[i]=arr[j];
			i++;
		}
		for(int k=1;k>=l;k++) {
			for(int m=k;m<k;m++) {
				System.out.println(b[k]);
			}
		}
		
		
		
		
	}

}
