import java.util.Scanner;
public class ReverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		System.out.println(rev);
	}

}
