/*The Program's Name:Lab3Second;
**Name: Ziqiao(John) Lin;
**Date of Finish: Oct,4,2015;
**Course:CPSC1150;
**Compiler:JDK1.7;
**The Purpose of each class: This class is going to calcuate the roots of qurdratic equation;
*/





import java.util.Scanner;  //import the Scanner function

public class Lab2Second{
   public static void main(String[] args){
      Scanner input=new Scanner(System.in);
      System.out.println("This program is for the solutions of quadratic equation");
      System.out.print("Please input a value for ax^2:");  //notice user to input the value of a
      double a=input.nextDouble();   // declare variable a and get the input to initilize
      System.out.print("Please input b value for bx:");    //notice user to input the value of b
      double b=input.nextDouble();   // declare variable a and get the input to initilize
      System.out.print("Please input c value for c:");     //notice user to input the value of c
      double c=input.nextDouble();   // declare variable a and get the input to initilize
      if(a==0){            //check the equation whether a linear or quadratic equation
         System.out.println("This is a linear equation"); 
         double x=-c/b;    // print out the only solution for linear function
         System.out.println("The only solution x is "+x);
      }else if(b*b-4*a*c <0){    // check the equation whether has real roots
         System.out.println("The equation has no real roots");
      }else if(b*b-4*a*c>0){     // check  the quadratic equation whether has two different real roots
         double x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);   // sign the solution1 for quadratic equation for variable x1
         double x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);   // sign the solution2 for quadratic equation for variable x2
         System.out.println("The equation has 2 real roots.x1="+x1+"  x2="+x2);//print out the solution2 for quadratic equation
      }else{
         double x=-b/(2*a);      // sign the only solution for quadratic function to x
         System.out.println("This Quadratic Equation only has on solution x="+x); // print out the solution
      }
   }
}