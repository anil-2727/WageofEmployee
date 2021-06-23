package javaworld;

public class EmpWageUC2 {
	
	public static void main(String[] args) {
	
		  int Is_Full_Time = 1;
		  int Wage_Per_Hour = 20;
		  int Emprhr = 0;
		  
    double empCheck = Math.floor(Math.random() * 10) % 2;
        System.out.println("empCheck="+empCheck);
        
	   if (empCheck == Is_Full_Time){
	   System.out.println("Employee is Present");
	   Emprhr = 8;
	   }
	    
	  else{
	   System.out.println("Employee is Absent");
	   Emprhr = 0;
	  }
	   double Wage_per_day = ((Wage_Per_Hour) * (Emprhr));
	   System.out.println("Daily wage of employee ="+Wage_per_day);
	   
	   }
	   
	}  

