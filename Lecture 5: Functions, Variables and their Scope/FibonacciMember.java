import java.util.Scanner;
public class FibonacciMember {
	public static boolean fm(int n)
	{
		if((Math.ceil(Math.sqrt(5*Math.pow(n, 2)+4))==Math.sqrt(5*Math.pow(n, 2)+4))||(Math.ceil(Math.sqrt(5*Math.pow(n, 2)-4))==Math.sqrt(5*Math.pow(n, 2)-4)))
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fm(n));
	}
}
