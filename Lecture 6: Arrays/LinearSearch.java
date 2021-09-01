import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int flag=0;
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=s.nextInt();
			int x=s.nextInt();
			for(int i=0;i<n;i++)
			{
				if(arr[i]==x)
				{
					System.out.println(i);
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("-1");
		}
	}

}
