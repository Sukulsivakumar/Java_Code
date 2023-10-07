package basics;
import java.util.*;
public class sort_array {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) {
					c=arr[j];
					arr[j]=arr[i];
					arr[i]=c;
				}
			}
			}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
			}
	}