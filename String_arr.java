package basics;
import java.util.Scanner;
public class String_arr {
	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++){
		    s[i]=io.next();
		}
		int c=0;
		for(int i=0;i<n;i++){
		    c=0;
		    if(i%2!=0){
		    for(int j=0;j<s[i].length();j++){
		        if(s[i].charAt(j)!='A'&&s[i].charAt(j)!='E'&&s[i].charAt(j)!='I'&&s[i].charAt(j)!='O')
		        c++;
		    }
		}
		else {
		    for(int j=0;j<s[i].length();j++){
		        char h=s[i].charAt(j);
		        if(h=='A'||h=='E'||h=='I'||h=='O'||h=='U')
		        c++;
		    }
		}
		System.out.println(c);
		}

	}

}
