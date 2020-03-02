 package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	    String emp_id; //instance variable
	    String empname;
	    float empbasic,hra,da,Gross_salary;
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    Employee() throws IOException{                         //constructor
	        System.out.println("Enter Employee_Id");
	        emp_id=br.readLine();
	        System.out.println("Enter name:");
	        empname=br.readLine();
	        System.out.println("Enter Basic Salary:");
	        empbasic=Float.parseFloat(br.readLine());
	       
	    }
	    //instance methods
	    void disp() {
	        System.out.println("Employee_Id="+emp_id+" "+"Employee_Name="+empname+" "+"Basic Salary="+empbasic+" "+"Gross_Salary="+Gross_salary);
	    }
	  void calgross() {
	   if(empbasic<=10000)
	   {
		   hra=8*empbasic/100;
		   da=10*empbasic/100;
		   Gross_salary=empbasic+hra+da;
	    }
	   if(empbasic<=20000) 
	   {
		   hra=16*empbasic/100;
		   da=20*empbasic/100;
		   Gross_salary=empbasic+hra+da;
	    }
	   else
	   {
		   hra=24*empbasic/100;
		   da=30*empbasic/100;
		   Gross_salary=empbasic+hra+da;
	    }
	  }
	   
	    public static void main (String[] args) throws IOException {
	                                                                             //user input
	                                                                            //Array of Objects
	        Employee[] emp=new Employee[3];
	        for(int i=0;i<emp.length;i++) {
	        emp[i]=new Employee();
	        }
	        for(int i=0;i<emp.length;i++) {
	        	emp[i].calgross();
	        	emp[i].disp();
	        }
	        
	       
	       

	    }

	}

	  
