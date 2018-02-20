/*The Program's Name:Diamond_XY;
 *Name: Ziqiao(John) Lin;
 *Date of Finish: Oct,7,2015;
 *Course:CPSC1150;
 *Compiler:JDK1.7;
 *The Purpose of each class: This class is going to show a diamond in the x & y-axis;
 *The length and the x & y coordinates are inputed by user;
 */
import java.util.Scanner;  //define Scanner function

public class Diamond{
	private static Scanner input;

	public static void main(String[] args){
		input = new Scanner(System.in);
		System.out.println("This program is to show a diamond!");  // notice user the program has started
		System.out.print("Please input an odd integer:");  // notice user input a value for the size of diamond
		int x=input.nextInt();  // define x as an integer and transfer the value to x
		int a;  // define a as an integer to account the line of diamond
		if(x%2==1){  // check the size of diamond whether is odd or not
			for(a=1;a<=x/2+1;a++){  // start the line for the upper half diamond
				for(int j=1;j<=x/2+1-a;j++){  // repetition to print out space
					System.out.print(" ");
				}
			    for(int k=1;k<=2*a-1;k++){  // repetition to print out star
				    System.out.print("*");
			    }
			    System.out.print("\n");  // start a new line in this iteration 
			}
			for(int b=a-2;b>=1;b--){  // start the line for the lower half diamond
				for(int j=1;j<=x/2+1-b;j++){  // repetition to print out space
					System.out.print(" ");
				}
			    for(int k=1;k<=2*b-1;k++){  // repetition to print out star
				    System.out.print("*");
			    }
			    System.out.print("\n");   // repetition to print out space
			}
			
			
		}else{
			System.out.println("invaild input: the integer must be odd");
		}
	}
}