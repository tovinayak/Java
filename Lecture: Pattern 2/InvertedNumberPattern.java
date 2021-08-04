import java.util.Scanner;
public class InvertedNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j>0;j--)
				System.out.print(i);
			System.out.println();
		}
	}

}
