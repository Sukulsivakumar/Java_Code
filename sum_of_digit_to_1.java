package basics;
import java.util.*;
public class sum_of_digit_to_1 {
public static void main(String arg[]) {
	Scanner s= new Scanner(System.in);
	int num = s.nextInt();
	sum_of_digit(num);
	
}
static void sum_of_digit(int n) {
	int sum=0;
	int m=0;
	while(n>0) {
		m=n%10;
		sum=sum+m;
		n/=10;
	}
	if(sum>=10) {
		sum_of_digit(sum);
	}	
	else {
		System.out.print(sum);
	}
}
}
