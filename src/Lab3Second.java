/* The Program's Name: Lab3Second;
 * Name: Ziqiao(John) Lin
 *Date:Oct,4,2015
 *Course:CPSC1150
 *Compiler:JDK1.7
 *Purpose for each class: to display the star constructed by *, and the level is read by user
 */
import java.util.Scanner;  // import input function

public class Lab3Second{
   public static void main(String[] args){
     Scanner input=new Scanner(System.in);  // define input as scanner 
     System.out.print("please input an integer:");  // notice user to input
     int n=input.nextInt();  // define n as an integer and initialize it by the input
     for(int i=1;i<=n;i++){  //loop body i define the increasing level of star
       for(int j=1;j<=i;j++){ // define j to decide the number of * in each line
         System.out.print("*"); // print out *
        }
       System.out.print("\n"); // after print out * each line, start from a new line
        }
     for(int i=n-1;i>=1;i--){ // loop body to print out the decreasing level of *
        for(int j=1;j<=i;j++){ // define j to print out the same number of * as i
          System.out.print("*"); // print out *
        }
        System.out.print("\n"); // after print out * each line, start from a new line
        }
   }

}