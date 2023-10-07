package basics;
import java.util.*;
public class Nth_prime {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int c=0;
		for(int i=2;i<1000000;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
	}
			if(count==2) {
				c++;
				if(c==n) {
					System.out.print(i);
				}

			}
		}
	}
}