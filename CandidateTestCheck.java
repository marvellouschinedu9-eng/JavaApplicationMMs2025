import java.util.Scanner;

public class CandidateTestCheck{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter Full Name: ");
		String fullName = scan.nextInt();
		
		System.out.print("Please enter your name: ");
		String CandidateName = scan.nextLine();
		
		System.out.print("Please enter your English score: ");
		int english = input.nextInt();
		
		System.out.print("Please enter your Mathematics score: ");
		int maths = scan.nextInt();
		
		System.out.print("Please enter your ICT score: ");
		int ict = scan.nextInt();
		
		double avaerage = (english + maths + ict)/3;
		
		if(english > 75 && average >= 80){
			System.out.println("Employment letter sent");
		
			
			