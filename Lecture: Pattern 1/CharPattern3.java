import java.util.Scanner;
public class CharPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			char startingChar=(char)('A'+i);
			for(int j=0;j<=i;j++)
				System.out.print(startingChar++);
			System.out.println();
		}
		s.close();
	}

}
