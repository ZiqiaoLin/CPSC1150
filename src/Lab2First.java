/* The Program's Name: Lab2First;
** Name: Ziqiao(John) Lin
**Date:Sep,25,2015
**Course:CPSC1150
**Compiler:JDK1.7
**Purpose for each class: I only have one class for do the x,y calculation
*/



public class Lab2First{
    public static void main (String[] args){
        double a = 1.45;     // Declare the data type as double
        double b = 2.67;     // Declare the data type as double
        double x = 0, y= 0;  // Declare the data type as double
                
        // your code goes hear
        
         x=(Math.pow(a,3)+Math.sqrt(b+Math.sqrt(a)/(1+Math.pow(b,3))))/(1+a/Math.sqrt(b));// This is the equation to find value of x
         y=(Math.sin(a*a)+Math.cos(a*b))/(Math.PI*Math.sin(b));  // This is the equation to find value of y


        System.out.println("x = " + x); //output the value of x
        System.out.println("y = " + y); //output the value of y
    
    }
}    