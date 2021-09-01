import java.util.Scanner;
public class ReturnArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int size=s.nextInt();
			int arr[]=new int[size];
			int sum=0;
			for(int i=0;i<size;i++)
			{
				arr[i]=s.nextInt();
				sum+=arr[i];
			}
			System.out.println(sum);
		}
	}

}
