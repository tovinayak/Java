import java.util.Scanner;
public class SumOfEvenNumbersTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		for(int i=2;i<=a;i+=2)
			sum+=i;
		System.out.println(sum);
	}
}
