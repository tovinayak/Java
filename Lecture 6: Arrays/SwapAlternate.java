import java.util.Scanner;
public class SwapAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int arr[]=new int[n];
			int x=0,a=0;
			for(int i=0;i<n;i++)
				arr[i]=s.nextInt();
			for(int i=0;i<n;i+=2)
			{
				if(i+1<n)
				{
					a=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=a;
				}
			}
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
		}
	}

}
