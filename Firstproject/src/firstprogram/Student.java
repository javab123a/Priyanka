/*package firstprogram;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
    //instance variables
    String reg_id;
    String name;
    float marks;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Student() throws IOException{
        System.out.println("Enter RegId:");
        reg_id=br.readLine();
        System.out.println("Enter name:");
        name=br.readLine();
        System.out.println("Enter marks:");
        marks=Float.parseFloat(br.readLine());
       
    }
    //instance methods
    void disp() {
        System.out.println("Reg_Id="+reg_id+" "+"Name="+name+" "+"Marks="+marks);
    }
    static void cal_highest(Student stud[]) {
   
       
       
   
    }
   
    public static void main(String[] args)throws IOException {
        //user input
        //Array of Objects
        Student[] stu=new Student[5];
        for(int i=0;i<stu.length;i++) {
        stu[i]=new Student();
        }
        for(int i=0;i<stu.length;i++) {
        stu[i].disp();
        }
        cal_highest(stu);
       
       

    }

}




