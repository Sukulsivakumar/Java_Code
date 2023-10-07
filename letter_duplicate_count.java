package basics;
import java.util.Scanner;
public class letter_duplicate_count {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String st= s.next();
		String str= st.toUpperCase();
		int len= str.length();
		int ar[]=new int[26];
		for(int i=0;i<len;i++) {
			ar[str.charAt(i)-'A']++;
		}
		int c=0;
		for(int i=0;i<26;i++) {
			if(ar[i]>1) {
					c=c+(ar[i]/2);
			}
		}
		System.out.print(c);
	}

}
