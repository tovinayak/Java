package Patterns;
import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int space1=1;
			while(space1<=n-i) {
				System.out.print(" ");
				space1++;
			}
			int j=1;
			while(j<=(2*i)-1) {
				System.out.print("*");
				j++;
			}
			int space2=1;
			while(space2<=n-i) {
				System.out.print(" ");
				space2++;
			}
			System.out.println();
			i++;
		}
	}

}
