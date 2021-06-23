package javaworld;

public class EmpWageUC3 {
	
	public static void main(String[] args) {
		  int Is_Full_Time = 1;
		  int Is_Part_Time = 2;
		  int Wage_Per_Hour = 20;
		  int Emprhr = 0;
		  
    double empCheck = Math.floor(Math.random() * 10) % 3;
    System.out.println("empCheck="+empCheck);
    
	     if (empCheck == Is_Full_Time){
	  	  System.out.println("Employee is Present");
	  	   Emprhr = 8;
	       }
	    else if (empCheck == Is_Part_Time){
	  	 System.out.println("Employee is part time");
	  	 Emprhr = 4;
	     }
	    else{
	     System.out.println("Employee is Absent");
	     Emprhr = 0;
	    }
	      double Wage_per_day = ((Wage_Per_Hour) * (Emprhr));
		     System.out.println("Daily Wage of Employee="+Wage_per_day);
}
}