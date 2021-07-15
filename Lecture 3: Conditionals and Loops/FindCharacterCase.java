package if_else;
import java.util.Scanner;
public class FindCharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char c=str.charAt(0);
		if(c>=65 && c<=90) {
			System.out.println("1");
		}
		else if(c>=97 && c<=122) {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
	}

}
