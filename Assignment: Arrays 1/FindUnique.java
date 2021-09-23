import java.util.Scanner;
public class FindUnique {
	public static int unique(int arr[])
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
			res=res^arr[i];
		return res;
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
			System.out.println(unique(arr));
		}
	}

}
