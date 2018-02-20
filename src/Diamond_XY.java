/*The Program's Name:Diamond_XY;
 *Name: Ziqiao(John) Lin;
 *Date of Finish: Oct,7,2015;
 *Course:CPSC1150;
 *Compiler:JDK1.7;
 *The Purpose of each class: This class is going to show a diamond in the x & y-axis;
 *The length and the x & y coordinates are inputed by user;
*/
import java.util.Scanner;  //import Scanner function

public class Diamond_XY{
    private static Scanner input;

	public static void main(String[] args){
	    input = new Scanner(System.in);
		System.out.println("This program is to show a diamond in x&y_axis!");     //notice user the program starts
		System.out.print("Please input an odd number for diamond:");     //notice user to input a value for diamond
		int diamond=input.nextInt();     // define diamond as an integer and initialize it with the input
		System.out.print("Please input the value of x-coordinate:");    //notice user to input a value for x-coordinate of diamond
		int x_coords=input.nextInt();    // define x_coords as an integer and accept the value of x-coordinate
		System.out.print("Please input the value of y-coordinate:");    //notice user to input a value for y-coordinate of diamond
		int y_coords=input.nextInt();     // define x_coords as an integer and accept the value of x-coordinate
		int j=0;    // define j as an integer to account the line of diamond 
		final int Y_AXIS=20,X_AXIS=40;    // define Y_AXIS & X_AXIS as constant for the x & y coordinate
		if(diamond%2==1){       // because diamond has to be odd level, this selection is to check whether the value of diamond is odd or not
			if(x_coords>0&&y_coords>0){    //check the x & y coordinates whether is in the first quadrant
				if(x_coords<=X_AXIS&&y_coords<=Y_AXIS){    // check x & y value whether is over the limited quadrant
					if(diamond<=y_coords){  // check whether diamond can be displayed fully by y coordinate
						if(diamond/2+1<=x_coords&&diamond/2+x_coords<=X_AXIS){  // check whether the diamond can be displayed fully by x coordinate
							System.out.print("  ^\n");  // start to draw y coordinate
						    for(int y=Y_AXIS;y>=1;y--){  // loop body starting from highest y value
						    	if(y<=y_coords&&y>=(y_coords-diamond/2)){ // selection for y coordinate of diamond 
						    		  j++;  // j start to account the level of diamond
									  if(y!=5){ 
									    System.out.print(y%5==0? y+"+":"  |"); // shorthand selection to sign the value of y when y is the time of 5
								      }else{
										System.out.print(" "+y+"+");  // this is only for y=5 to show correct space 
									  }
									
									  for(int k=1;k<=x_coords-j;k++){  // repetition for space of diamond in each diamond level
										System.out.print(" ");
									  }
									  for(int l=1;l<=j*2-1;l++){  // repetition for star of diamond in each diamond level
										System.out.print("*");
									  }
									  System.out.print("\n");  // go for a new line after finish of construction of the each diamond level
						    	}else if(y<=(y_coords-diamond/2-1)&&y>=(y_coords-diamond)){  // selection for y coordinate of diamond
						    		  j--;
								      if(y!=5){
								    	  System.out.print(y%5==0? y+"+":"  |");// shorthand selection to sign the value of y when y is the time of 5
									  }else{
										System.out.print(" "+y+"+");
									  }
								      for(int k=1;k<=x_coords-j;k++){   // repetition for space of diamond in each diamond level
										System.out.print(" ");
								      }
								      for(int l=1;l<=j*2-1;l++){  // repetition for star of diamond in each diamond level
										System.out.print("*");
							          }
								      System.out.print("\n"); // go for a new line after finish of construction of the each diamond level
								  }else{
								      if(y!=5){
										System.out.print(y%5==0? y+"+":"  |");// shorthand selection to sign the value of y when y is the time of 5
									  }else{
										System.out.print(" "+y+"+");
									  }
									   System.out.print("\n"); // go for a new line after finish of construction of the each diamond level
								  }
						    }
						    System.out.print("  ");  // two space for x coordinate because the number of y axis account two space
					        for(int x=0;x<=X_AXIS-1;x++){  // start to construct x-axis
						        System.out.print(x%5==0? "+":"-");	   // shorthand selection to note + when the number is the times of 5
					        }
					        System.out.print("->\n"); // the end of x-axis
					        System.out.print("  ");  // two space for x coordinate because the number of y axis account two space
					        for(int x=0;x<=X_AXIS;x++){  //start to construct the line below x-axis
						        if(x<10){  
						          System.out.print(x%5==0? x:" "); // shorthand selection for x below 10 to note the number which is the time of 5
						        }else{
							      System.out.print(x%5==0?"\b"+x:" ");  // shorthand selection for x up 10 to note the number which is the time of 5
						        }
							  
					        }
						}else{
							System.out.println("Invaild input:the width of diamond should be within the x-coordinate");  // proper error message for diamond over x-coordinate
						}
					}else{
						System.out.println("Invaild input: the length of diamond should be within the y-coordinate");  // proper error message for diamond over y-coordinate
					}
				}else{
					System.out.println("Invaild input:Invail input:x-coordinate should be within 40 and y-coordinate should be within 20 ");// proper error message for coordinate of diamond over the limit
				}
			}else{
				System.out.println("Invaild input: both x and y coordinates should be positive");// proper error message for the coordinate of diamond is negative
			}
		}else{
			System.out.println("Invaild input: the length of diamond should only be odd");// proper error message for the level of diamond should be odd
		}
	}
}
