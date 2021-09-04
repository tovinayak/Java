import java.util.Scanner;
public class BinarySearch {
	public static int binarySearch(int arr[],int x)
	{
		int start=0,end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				end=mid-1;
			else
				start=mid+1;
		} 
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int t=s.nextInt();
		while(t-->0)
		{
			int x=s.nextInt();
			System.out.println(binarySearch(arr, x));
		}
	}

}
