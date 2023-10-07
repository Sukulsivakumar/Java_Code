package basics;

import java.util.*;
public class wheels_vechicle
{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int v=sc.nextInt();
		
		int vv,tv;
		if((w>v)&&(w%2==0)&&(v%2==0)){
		 vv=v*2;
		 tv=w-vv;
		 tv=tv/2;
		 
		 System.out.println("Two Wheeler "+(v-tv));
		 System.out.println("Four Wheeler "+tv);
	}
	else{
	    System.out.println("NOT POSSIBLE");
	}
	}
}