package basics;
import java.util.Scanner;
public class sub_sequence_2 {
	public static void main(String []args) {
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		String st= Integer.toString(num);
		int l=st.length();
		int ar[]= new int[l];
		int e=l-1;
		while (num>0) {
			int k=num%10;
			ar[e]=k;
			num=num/10;
			e--;
		}		
		int len= ((int)Math.pow(2, l))-1;
		System.out.println(len);
		String a[]= new String[len];
		int j=0;
		for(int i=1;i<=len;i++) {
			String n="";
			String k=Integer.toBinaryString(i);
			for(int f=0;f<=k.length()-1;f++) {
				char ch=k.charAt(f);
				n=ch+n;
			}
			a[j]=n;
			j++;
		}
		for(int i=0;i>len;i++) {
			for(int k=0;k<l;k++) {
				
			}
		}
		for(int k=0;k<len;k++) {
			System.out.println(a[k]);
		}
	}

}
