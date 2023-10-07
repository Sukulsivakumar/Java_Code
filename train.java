package basics;
import java.util.Scanner;
public class train {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a= (s.nextInt())%8;
		if(a==2||a==5) System.out.print("UPPER");
		else if(a==3||a==6) System.out.print("MIDDLE");
		else if(a==4||a==7) System.out.print("LOWER");
		else if(a==0) System.out.print("Side UPPER");
		else if(a==1) System.out.print("Side LOWER");
	}
}
