package basics;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (isPalindromePossible(number)) {
            System.out.println("The number can be rearranged to form a palindrome.");
        } else {
            System.out.println("The number cannot be rearranged to form a palindrome.");
        }
    }
    
    public static boolean isPalindromePossible(int number) {
        int[] digitCount = new int[10];
        while (number > 0) {
            int digit = number % 10;
            digitCount[digit]++;
            number /= 10;
        }
        int oddCount = 0;         
        for (int count : digitCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }
}
