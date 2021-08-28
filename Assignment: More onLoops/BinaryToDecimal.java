import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int deci=0,i=0;
		while(n!=0)
		{
			deci=deci+(int)Math.pow(2,i++)*n%10;
			n/=10;
		}
		System.out.println(deci);
	}

}
