 
		package firstprogram;

		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

		public class Constructor {
		    //instance variables
		    String reg_id;
		    String name;
		    float marks;
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    Constructor() throws IOException{
		        System.out.println("Enter RegId");
		        reg_id=br.readLine();
		        System.out.println("Enter name");
		        name=br.readLine();
		        System.out.println("Enter marks");
		        marks=Float.parseFloat(br.readLine());
		       
		    }
		    Constructor(String r,String n,float m)throws IOException{
		    	this.reg_id=reg_id;
		    	this.name=name;
		    	this.marks=marks;
		    	
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
		        Student[] stu=new Student[3];
		        for(int i=0;i<stu.length;i++) {
		        stu[i]=new Student();
		        }
		        for(int i=0;i<stu.length;i++) {
		        stu[i].disp();
		        }
		        cal_highest(stu);
		        
		       

		    }

		


	}


