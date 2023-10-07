package basics;

import java.util.Scanner;
public class neon_number{
    public static void main(String arg[]){
        Scanner s= new Scanner(System.in);
        int num= s.nextInt();
        int m=num;
        num=num*num;
        int n=0;
        int var;
        while(num>0){
            var = num%10;
            n=n+var;
            num/=10;
        }
        if(m==n){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}