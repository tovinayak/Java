import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long result=0;
		int i=0;
		while(n!=0)
		{
			result=result+(long)Math.pow(10,i++)*(n%2);
			n/=2;
		}
		System.out.println(result);
	}

}
