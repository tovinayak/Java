import java.util.Scanner;
public class TripletSum {
	public static int tripletSum(int arr[],int x)
	{
		int count=0;
		for(int i=0;i<arr.length-2;i++)
		 {
			for(int j=i+1;j<arr.length-1;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==x)
						count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=s.nextInt();
			int x=s.nextInt();
			System.out.println(tripletSum(arr,x));
		}
	}

}