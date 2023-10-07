package basics;
import java.util.*;
public class factorial {
	public static void main(String[] args) {

	 Scanner s= new Scanner(System.in);
	 int a= s.nextInt();
	 int fact=1;
	 for(int i=1;i<=a;i++) {
		 fact=fact*i;
	 }
	 System.out.print(fact);
}
}
