import java.util.Scanner;
public class ReverseNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>0;j--)
				System.out.print(j);
			System.out.println();
		}
		s.close();
	}

}
