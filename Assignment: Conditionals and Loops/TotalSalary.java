
import java.util.Scanner;
public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int basic_salary=s.nextInt();
		String gr=s.next();
		char grade=gr.charAt(0);
		float hra=(float)0.20*basic_salary;
		float da=(float)0.50*basic_salary;
		float pa=(float)0.11*basic_salary;
		int allow=0;
		if(grade=='A') {
			allow=1700;
		}
		else if (grade=='B') {
			allow=1500;
		}
		else {
			allow = 1300;
		}
		int totalSalary= (int) Math.ceil(basic_salary+hra+da+allow-pa);
		System.out.println(totalSalary);
		s.close();
	}

}
