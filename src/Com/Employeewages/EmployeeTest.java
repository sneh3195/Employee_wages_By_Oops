package Com.Employeewages;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		
		System.out.print(" ENTER THE NO OF COMPONY: ");
		int n = input.nextInt();
		
		Employee obj = new Employee();
		
		for (int i = 0; i < n; i++) {
			
			input.nextLine(); // to read the extra \n before it
			System.out.print("\n\n ENTER THE NAME OF COMPONY: ");
			name = input.nextLine();
			
			System.out.print(" ENTER MAX WORKING DAYS IN ONE A MONTH: ");
			int no_of_days = input.nextInt();
			
			System.out.print("  ENTER MAX WORKING HOURS IN ONE A MONTH: ");
			int max_hours_in_month = input.nextInt();
			
			System.out.print("ENTER DAILY WAGES PER HOUR: ");
			int wages_per_hour = input.nextInt();
			
			obj.computeEmployeeWage(name, no_of_days, max_hours_in_month, wages_per_hour);
			name = "";
		}
		input.close();
	}

}
