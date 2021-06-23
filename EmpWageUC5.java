package javaworld;

public class EmpWageUC5 {

	 public static final int Is_Full_Time = 1;
	 public static final int Is_Part_Time = 2;
	 public static final int Wage_Per_Hour = 20;
	 public static final int Days_in_Month = 20;
	
	public static void main(String[] args){ 
		 int emphr = 0;
		 int empwage = 0;
		 int total_employee_wage = 0;
		
		 for (int day = 0; day< Days_in_Month; day++){
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
empwage = ((Wage_Per_Hour)*(emphr));
total_employee_wage += empwage;
System.out.println("Daily Wage of Employee="+empwage);
		 }
System.out.println("total Wage of Employee="+total_employee_wage);

}
}

