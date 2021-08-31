import java.util.Scanner;
public class CheckNumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		int b=a;
		int flag_d=0,flag_i=0,flag=0;
		for(int i=1;i<n;i++)
		{
			a=s.nextInt();
			if(b>a)
			{
				flag_d=1;
				if(flag_i==1)
					flag=1;
			}
			else if(b<a)
				flag_i=1;
			else
				flag=1;
			b=a;
		}
		if(flag==1)
			System.out.println("False");
		else
			System.out.println("True");
	}

}
