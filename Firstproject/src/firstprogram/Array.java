package firstprogram;

public class Array {

	public static void main(String[] args) {
		int[] ar= {3,5,1,7,2};
		sort(ar);
	}

 static void sort(int[] ar) {
	 int i,j,temp;
	 for(i=0;i<ar.length;i++)
	 {
		 for(j=0;j<ar.length-1;j++) {
         if(ar[j]>ar[j+1])	{
	     temp=ar[j];
	     ar[j]=ar[j+1];
	     ar[j+1]=temp;
	      }
	
         }
	 }
 for(i=0;i<ar.length;i++) {
 System.out.println(ar[i]);
    }
  }
}
