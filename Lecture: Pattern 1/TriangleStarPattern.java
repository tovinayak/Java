import java.util.Scanner;
public class TriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		s.close();
	}

}
