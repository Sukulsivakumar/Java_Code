package basics;
import java.util.*;
public class prime {
public static void main(String[] args) {
	 Scanner s= new Scanner(System.in);
	 int a= s.nextInt();
	 int count=0;
	 for(int i=1;i<=a;i++) {
		 if(a%i==0) {
			 count+=1;
		 }
	 }
	 if(count==2) {
		 System.out.print("Prime");
	 }
	 else {
		 System.out.print("not Prime");
	 }
		
	}
}

