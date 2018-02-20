/* The Program's Name: Lab4Second;
** Name: Ziqiao(John) Lin
**Date:Oct,11,2015
**Course:CPSC1150
**Compiler:JDK1.7
**Purpose for each class: develop a for loops to calculate sum of all numbers from 1 to n that are dividible by either a or b, but not both ; 
*/public class Lab4Second{
    public static void main (String[] args){  //main class
	    int n,a,b;  // define a,b and n as integer type
	    int sum=0; // define sum as an integer and sign 0 to it
	    // Your code goes here
        a=6; // sign 6 to a
        b=7; // sign 7 to b
        n=100; //sign 100 to n
       for(int i=1;i<=n;i++){  // do repetition when i <=n
          if(i%a==0^i%b==0){  // select the number of i which can be divided by a or b, but not for both
             sum=sum+i;  
          }
          
       }
          
        
        
        System.out.println(" sum = "+ sum);  //print out the result
   
    }
}    