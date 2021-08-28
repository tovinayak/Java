import java.util.Scanner;
public class NthFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if (n==1 || n==2)
			System.out.println("1");
		int n1=1,n2=1;
		for(int i=3;i<=n;i++)
		{
			int temp=n1+n2;
			n1=n2;
			n2=temp;
		}
		System.out.println(n2);
	}

}