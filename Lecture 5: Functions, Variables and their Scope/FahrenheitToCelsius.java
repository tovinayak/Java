import java.util.Scanner;
public class FahrenheitToCelsius {
	public static void convert(int s,int e,int w)
	{
		for(int i=s;i<=e;i+=w)
			System.out.println(i+" "+(int)((5.0/9.0)*(i-32)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		int w=s.nextInt();
		convert(n,e,w);
	}

}
 