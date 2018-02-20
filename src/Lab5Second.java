/*The Program's Name:Lab5First;
**Name: Ziqiao(John) Lin;
**Date of Finish: Oct,22,2015;
**Course:CPSC1150;
**Compiler:JDK1.7;
**The Purpose of each class:to takes an integer number and changes aimport java.util.Scanner;
*/
import java.util.Scanner;  //import Scanner function
public class Lab5Second {  // main class
   public static void main(String []args){  // main method
	   Scanner input=new Scanner(System.in);  //define input as a Scanner
	   System.out.println("This program is to print all all prime palindrome numbers");  //notice user the purpose of this program
	   System.out.print("Please enter a number:"); //notice user to input a number
	   int number=input.nextInt();  // define number as an integer and give the value to number
	   Check(number);  // calling method
   }

  static boolean Prime(int n){  // boolean type method to check the number whether is a prime or not
	  int i=n;  // accept the number from pemeter
	  
		  for(int j=2;j<n;j++){
	  
		  if(i%j==0)
			  return false;
		   }
	  
	  return true;
  }
  static boolean Palindromes(int n){  // boolean type method to check the number whether is a palindromes or not
	  int i=0;
	  while(n/(int)Math.pow(10, i)>0){  // while loop to check the number of digits
		  i++;
	  }
	  if(i-1%2!=0){ // selection to check whether the number of digits is odd or even
		  for(int j=0,k=i-1;j<=(i-1)/2&&k>=(i-1)/2+1;j++,k--){  // repetition to compare the digits
			  if((n/(int)Math.pow(10, j)-(n/(int)Math.pow(10,j+1))*10)!=n/(int)Math.pow(10, k)-n/(int)Math.pow(10, k+1)*10){ //selection to check the comparing digits are same or not
				  return false;
		      }
		  }
	  }else{  
		  for(int j=0,k=i-1;j<=(i-1)/2-1&&k>=(i-1)/2+1;j++,k--){ // repetition to compare the digits
			  if((n/(int)Math.pow(10, j)-n/(int)Math.pow(10,j+1)*10)!=n/(int)Math.pow(10, k)-n/(int)Math.pow(10, k+1)*10){ //selection to check the comparing digits are same or not
				  return false;
			  }
		  }
		  
	  }
	  return true;
  }
  static void Check(int n){  // void method to print all prime and palindromes numbers
        for(int i=2;i<=n;i++){
        	if(Palindromes(i)&&Prime(i)){ // selection to select the number is both prime and palindromes
        		System.out.print(i+",");   //print out result
        	}
        }
  }





}
