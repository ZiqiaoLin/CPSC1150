/*The Program's Name:Lab5First;
**Name: Ziqiao(John) Lin;
**Date of Finish: Oct,22,2015;
**Course:CPSC1150;
**Compiler:JDK1.7;
**The Purpose of each class:to takes an integer number and changes all even digits to odd digits by adding one to each digit
*/public class Lab5First{
    public static void main(String[] args) //main method
    {
  	    // test cases:
	    int n=26540;
	    System.out.println("n= "+n+", ans= "+even2odd(n)); // print out result and call the method
	    n=9528;
	    System.out.println("n= "+n+", ans= "+even2odd(n)); // print out result and call the method
    }
  
    /** changes all even digits of argumet to odd digits by adding 1 to each digits
        @param n  a positive integer number
        @return the result as an integer number
        */    
    public static int even2odd(int n)  //method to change all even digits of number by adding 1 to each even digits
    {
  	int ans=0;
   ans=n;
   	//your goes here 
   for(int i=0;(n/(int)Math.pow(10,i))>0;i++){  //the loop to check every digit
      ans+=((n/(int)Math.pow(10,i))%2==0)?1*Math.pow(10,i):0;  //shorthand selection to add 1 to every even digit 
   }   
  	return ans;  // return the value 
    }
}    