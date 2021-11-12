package Com.Employeewages;

public class Employee {
 
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int MAX_HOUR_IN_MONTH = 100;
	public static final int NO_OF_WORKING_DAYS = 21;

      public int calculateEmpwage() {
		
    	  int empHrs = 0;
    	  int totalHrsInMonth = 0;
    	  int totalWorkingDaysInMonth = 0;
    	  
    	  while(totalHrsInMonth<=MAX_HOUR_IN_MONTH && totalWorkingDaysInMonth<NO_OF_WORKING_DAYS) {
    		  
    		  int empStatus = (int)Math.floor((Math.random()*10)%3);
    		  switch (empStatus) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:	
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				//break;
			}
    		  totalHrsInMonth += empHrs;
    		  System.out.println("Total Days :" +totalWorkingDaysInMonth);
    	  }
    	  
    	  int totalWage = totalHrsInMonth * EMP_RATE_PER_HOUR;
    	  System.out.println("Total Employee wages for the month is : "+totalWage);
    	  
    	  return totalWage;
    	  
      }



}
