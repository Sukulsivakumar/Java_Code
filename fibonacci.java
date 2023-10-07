package basics;
import java.util.*;
public class fibonacci {
	public static void main(String[] args) {
	 Scanner s= new Scanner(System.in);
	 int a= s.nextInt();
	 int b=0;
	 for(int i=0;i<=a;i++) {
		 b=i+(i+1);
		 System.out.println(b);
	 }
}
}