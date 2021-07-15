import java.util.Scanner;
public class SumOfOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n=s.next();
		int sum_even=0,sum_odd=0;
		for(int i=0;i<n.length();i++)
		{
			char a=n.charAt(i);
			int q=Character.getNumericValue(a);
			if(q%2==0)
			{
				sum_even+=q;
			}
			else
			{
				sum_odd+=q;
			}
		}
		System.out.println(sum_even+" "+sum_odd);
	}

}
