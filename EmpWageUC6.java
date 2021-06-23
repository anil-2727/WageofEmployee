package javaworld;

public class EmpWageUC6 {
	

	 public static final int Is_Full_Time = 1;
	 public static final int Is_Part_Time = 2;
	 public static final int Wage_Per_Hour = 20;
	 public static final int Days_in_Month = 20;
	 public static final int Max_Hrs_In_Month = 100;
	 
	public static void main(String[] args){ 
		 int emphr = 0;
		 int empwage = 0;
		 int total_employee_wage = 0;
		 int totalemphrs = 0;
		 int totalWorkingDays = 0;

	while(totalemphrs <= Max_Hrs_In_Month && totalWorkingDays < Days_in_Month){	 
		totalWorkingDays++;
  int empCheck = (int)Math.floor(Math.random() * 10) % 3;
    System.out.println("empCheck="+empCheck);  

switch (empCheck){
case 1:
	     System.out.println("Employee is FullTime Present");
	    emphr = 8;
	     break;
case 2:
	  System.out.println("Employee is PartTime Present");
	  emphr = 4;
	  break;
default:
	  System.out.println("Employee is Absent");
	  emphr = 0;
}
totalemphrs +=emphr ;
System.out.println("day#: " + totalWorkingDays + "Emp Hr : " +emphr);
		 }
	int totalempwage = totalemphrs * Wage_Per_Hour;
System.out.println("total Wage of Employee="+totalempwage);

}
}

