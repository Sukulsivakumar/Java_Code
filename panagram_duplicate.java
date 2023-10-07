package basics;

import java.util.*;
public class panagram_duplicate{
  public static void main (String[] args) {
      Scanner sc=new Scanner(System.in);
      int  sizeOfarray = sc.nextInt();
      sc.nextLine();
      String a=sc.nextLine(),b=sc.next();
      char arr[]=a.toCharArray();
      String al ="abcdefghijklmnopqrstuvwxyz";
      char alpha[]=al.toCharArray();
      for(int i=0;i<arr.length;i++){
        if(arr[i]>='a'&&arr[i]<='z'){
           alpha[i]='\0';
        }
      }
      int c=0;
      for(int i=0;i<alpha.length;i++){
        if(alpha[i]!='\0') {System.out.println("No"); break;}
        else {c++;}
      }
      if(c==26) {System.out.println("Yes");}
  }
}