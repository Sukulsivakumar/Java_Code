package basics;
import java.util.*;
public class senario_1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int k1 = s.nextInt();
		int k2 = s.nextInt();
		int v1 = s.nextInt();
		int v2 = s.nextInt();
		int i=k1;
		int f=0;
		while(k1<10000 && k2<10000) {
			k1=k1+v1;
			k2=k2+v2;
			if(k1==k2) {
				f=1;
				break;
			}
		}
		if(f==1) {
			System.out.print("Yes");
		}
		else {
			System.out.print("NO");
		}
		
	}
}
