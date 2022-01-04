package sample;

import java.util.InputMismatchException;
import java.util.Scanner;



public class area {
	public void fdareac(double r) {
		System.out.println(3.14*r);
	}
	public void fdareas(double a) {
		System.out.println(a*a);
	}
	public void fdarear(double l, double b) {
		System.out.println(l*b);
	}
	public static void main(String[] args) {
		System.out.println("Please select the shape\n Press 1 for c\n Press 2 for s\n Press 3 for r");
		try {
			Scanner n = new Scanner(System.in);
			int choice = n.nextInt();
			
			if (choice == 1) {
				area c = new area();
				System.out.println("Please enter the radius");
				double r = n.nextDouble();
				c.fdareac(r);
			}
			
			else if (choice == 2) {
				area s = new area();
				System.out.println("Please enter the length");
				double a = n.nextDouble();
				s.fdareas(a);
			}
			
			else if (choice == 3) {
				area r = new area();
				System.out.println("Please enter length and bredth");
				double l = n.nextDouble();
				double b = n.nextDouble();
				r.fdarear(l, b);
			}
			else if (choice > 3) {
				throw new ArithmeticException();
			}
			else if (choice < 1) {
				throw new ArithmeticException();
			}
		}
		
		catch (InputMismatchException e) {
			System.out.println("Only integer values are allowed");
		}
		
		catch (ArithmeticException e) {
			System.out.println("Please enter number between 1 to 3");
		}
		
		catch (Exception e) {
			System.out.println("Please enter a valid input");
		}
		
		finally {
			System.out.println("We're done");
		}
	}

}
