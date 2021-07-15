package while_loop;
import java.util.Scanner;
public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		while(S<=E) {
			float a=(float)(5.0/9.0)*(S-32);
			System.out.println(S+" "+(int)a);
			S=S+W;
		}
	}

}
