import java.util.Scanner;
public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int i=1;
		while(x>0)
		{
			if((3*i+2)%4!=0)
			{
				System.out.print((3*i+2)+" ");
				x--;
			}
			i++;
		}
	}

}
