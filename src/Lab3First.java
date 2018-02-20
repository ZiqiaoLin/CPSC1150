/* The Program's Name: Lab3First;
 * Name: Ziqiao(John) Lin
 *Date:Oct,4,2015
 *Course:CPSC1150
 *Compiler:JDK1.7
 *Purpose for each class: to calculate the months and years for the balance of a bank account
*/

public class Lab3First{
    public static void main (String[] args)
    {	
        double y=0,z=0;  //define y and z as double and initialize them as 0
	    int x = 3;  // define x as an integer and initialize x as 3
	    int n = 5;  // define n as an integer and initialize n as 5
	    // Your code goes here
       for(int i=1;i<=n;i++){  // loop body
       y+=(i/Math.pow(x,i));   // formula for y
       }
       for(int i=1;i<=n;i++){  // loop body
          z+=(i/(x+i+1.0));    // formula for z
       }
        
	    System.out.println("y= "+ y); // display the value of y
        System.out.println("z= "+ z); // display the value of z
    }
}    
