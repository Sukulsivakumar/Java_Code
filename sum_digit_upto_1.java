package basics;
import java.util.Scanner;
public class sum_digit_upto_1 {
    public static void main(String[] args) {
    	Scanner io= new Scanner(System.in);
    	int number = io.nextInt();
    	while (number > 9) {
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        System.out.println(number);
    }
}

