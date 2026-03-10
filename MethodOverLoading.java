import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Calculate Area of a Square");
		System.out.println("2. Calculate Area of a Rectangle");
		System.out.println("3. Calculate Area of a Triangle");
		
		System.out.print("Enter your choice:");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			    System.out.println("Enter the length of the square");
				int squareLength = input.nextInt();
				
				MethodOverLoading.area(squareLength );
			break;
			
			case 2:
			    System.out.println("Enter the length of the rectangle");
				int rectangleLength = input.nextInt();
				
				System.out.println("Enter the breath of the rectangle");
				int breathLength = input.nextInt();
				
				MethodOverLoading.area(rectangeLength,breathLength );
			break;
			
			case 3:
			    System.out.println("Enter the length of the triangle");
				int triangleLength = input.nextInt();
				
				 System.out.println("Enter the base of the triangle");
				double baseLength = input.nextDouble();
				
				MethodOverLoading.area(triangleLength,base);
			break;
			
			default:
			     System.out.print("Invalid Input ");
		}
	}
	
	public static void area(int length){
		int areaOfSquare =(int) Math.pow(length,2);
		System.out.printf("The area of the square is %d", areaofSquare);
	}
	
	public static void area(int length,int breadth){
		int areaOfRectangle = length * breadth;
		System.out.printf("The area of the rectangle is %d", areaofRectangle);
	}
	
	public static void area(int length,double base){
		int areaOfTriangle = 0.5 * length * base;
		System.out.printf("The area of the triangle is %.2f", areaofTriangle);
	}
	
}