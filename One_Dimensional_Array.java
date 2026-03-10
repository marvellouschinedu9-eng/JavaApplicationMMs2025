import java.util.Scanner;

public class One_Dimensional_Array{
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
		
		
		int[] marks = new int[10];
		int counter = 1;
	    
		
	    for(int i = 0; i < 10; i++){
	         System.out.printf("Enter the %n element: ",counter);
			   
			 marks[i] = scan.nextInt();
			   
			 counter++ ;
		}
		 System.out.printf("The elements of the array are: ");
		 for(int 1 = 0; 1 < 10; 1++){
			 System.out.printf("%d,",marks[1]);
		 }
		 
	
	}
	
}  