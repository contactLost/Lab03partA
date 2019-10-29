import java.util.Scanner;
public class ShapeTester {

	public static void main(String[] args) {

		ShapeContainer container = new ShapeContainer();
		boolean quit;
		quit = false;
		int choice;
		// Scanner scan = new Scanner(System.in);

		//App loop
		while(!quit) {

			//Print menu

			System.out.println("(1)Add shape");
			System.out.println("(2)Calculate total surface area");
			System.out.println("(3)Show collection info");
			System.out.println("(4)Quit");

			//Get and validate user input
			choice = getUserInputInt();

			//Process choice

			if(choice == 1) {		//Add shape
				int shapeChoice = 0;

				System.out.println("Choose shape (1)Circle-(2)Rectangle-(3)Square");

				shapeChoice = getUserInputInt();

				if(shapeChoice == 1) { //Circle
					int radius;
					System.out.println("Enter radius = ");				
					radius = getUserInputInt();
					
					Circle circle = new Circle(radius);
					container.add(circle);
					
				}
				else if(shapeChoice == 2) { //Rectangle
					int width;
					int height;
					
					System.out.println("Enter width = ");				
					width = getUserInputInt();
					System.out.println("Enter height = ");				
					height = getUserInputInt();
					
					Rectangle rectangle = new Rectangle(width,height);
					container.add(rectangle);
					
				}
				else if(shapeChoice == 3) { //Square
					int side;
					System.out.println("Enter side = ");				
					side = getUserInputInt();
					
					Square square = new Square(side);
					container.add(square);
					
				}
				else {
					System.out.println("Invalid input");
				}

			}
			else if(choice == 2) { //Calculate total surface area
				
				double area;
				area = container.getArea();
				System.out.println("Total area = " + area);
				
			}
			else if(choice == 3) { //Show collection info
				System.out.println( container.toString() );
			}
			else if(choice == 4) {	//Quit
				quit = true;
				System.out.println("Quiting...");
			}
			else {
				System.out.println("Invalid input. Try again.");
			}
		}
	}//Main end
	
	@SuppressWarnings("resource")
	private static int getUserInputInt() {
		int input = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			if( scan.hasNextInt() ) {
				input = scan.nextInt();
				break;
			}
			else {
				System.out.println("Invalid input");
			}
		}
		return input;
	}
	
	
	
	
	
	
}//Class end