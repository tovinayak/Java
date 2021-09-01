import java.util.Scanner;
public class ArrangeNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int arr[]=new int[n];
			int j=1;
			for(int i=0;i<n/2;i++)
			{
				arr[i]=j++;
				arr[n-i-1]=j++;
			}
			if(n%2!=0)
				arr[n/2]=n;
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
		}
	}

}
