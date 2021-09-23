import java.util.Scanner;
public class Sort01 {
	public static void sort(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				count++;
		}
		for(int i=0;i<count;i++)
			arr[i]=0;
		for(int i=count;i<arr.length;i++)
			arr[i]=1;
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
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
			sort(arr);
		}
	}

}
