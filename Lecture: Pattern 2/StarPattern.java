import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
				System.out.print(" ");
			for(int j=1;j<(2*i);j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
