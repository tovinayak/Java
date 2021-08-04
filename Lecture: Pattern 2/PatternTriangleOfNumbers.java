import java.util.Scanner;
public class PatternTriangleOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
				System.out.print(" ");
			int t=i;
			for(int j=1;j<=i;j++)
				System.out.print(t++);
			for(int j=1;j<i;j++)
				System.out.print(--t-1);
			System.out.println();
		}
	}

}
