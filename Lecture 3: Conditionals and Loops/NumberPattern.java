package Patterns;
import java.util.Scanner;
public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1,val=i;
			while(j<=i) {
				System.out.print(val);
				val++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
