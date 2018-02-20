/*The Program's Name:Coder;
**Name: Ziqiao(John) Lin;
**Date of Finish: Oct,29,2015;
**Course:CPSC1150;
**Section:004;
**Compiler:JDK1.7;
*/
import java.util.Scanner; //import Scanner function

public class Coder{
	/*
	 *main: This class is to encode the String after modify characters and numbers
	 * and add certain numbers to binary sentences
	 */
  public static void main(String[] args){  // main method
	  /**
	   @param s the message from user
	   @param coding the Code from user for circulation
	   @param aftercoder the string to accpet the message after circulation
	   */
	  
     Scanner input= new Scanner(System.in);  // define input as a new Scanner
     System.out.print("Input Message:");  // notice user to input a String
     String s=input.nextLine();  // define s as String and initialize with user's input
     System.out.print("Input Code:"); // notice user to input an integer to for coding
     int coding=input.nextInt();  //define coding as integer and initialize with user's input
     String aftercoder="";  // define aftercoder as String and initialize
     
     for(int j=0;j<s.length();j++){ // the loop for go through every character in String s
    	 if(s.charAt(j)>='A'&&s.charAt(j)<='Z'){  //check the character whether is capital letter or not
    		 aftercoder+=CodingForCL(s.charAt(j),coding);  // calling method CodingForCL and return a character to aftercoder
    	 }else if (s.charAt(j)>='a'&&s.charAt(j)<='z'){ //check the character whether is small letter or not
    		 aftercoder+=CodingForSL(s.charAt(j),coding);  // calling method CodingForSL and return a character to aftercoder
    	 }else if(s.charAt(j)>='0'&&s.charAt(j)<='9'){ //check the character whether is number or not
    		 aftercoder+=CodingForNum(s.charAt(j),coding); // calling method CodingForNum and return a character to aftercoder
    	 }else{
    		 aftercoder+=s.charAt(j);  // default argument: directly sign the character to aftercoder
    	 }
      } 
     System.out.print("Output:");
     for(int j=0;j<aftercoder.length();j++){  // the loop to go through all characters in the String of aftercoder
        System.out.print(int2Binary((int)aftercoder.charAt(j)));  //data type casting to integer and then call the method transfer integer to binary 
        }
  }
  
  /* This method for numerical character to circulate around,return type is character
   * define character j;
   * check whether character i is over '9' after circulating the number of coding or not
   * if i+coding is over character '9' back to'0'and continue to circulate
   *otherwise sign the value of i after circulate the number of coding
   *return character j to main method
   */
  /**
   @param i the character from main method 
   @param coding the integer number for circulation
   @return char j the character after circulation 
    **/
  static char CodingForNum(char i, int coding){ 
	  char j=' ';  
	  if(i+coding>'9'){  
		  j=(char)(i+coding-10);  
	  }else{
		  j=(char)(i+coding);  
	  }
	 
	  return j;  
  }

  /*
   * method for small letters to circulate,return type is character
   * define character j;
   * check whether character i is over 'z' after circulate
   * if i+coding is over character 'z' back to'a'and continue to circulate
   * otherwise sign the value of i after circulate the number of coding
   * return character j to main method
   */
   /**
   @param i the character from main method 
   @param coding the integer number for circulation
   @return char j the character after circulation 
    **/
  static char CodingForSL(char i, int coding){  
	  char j=' ';  
	  if(i+coding>'z'){  
		   j=(char)(i+coding-26); 
	  }else{
		  j=(char)(i+coding); 
	  }
	  return j;  
  }

  /*
   * method for small letters to circulate,return type is character
   * define character j;
   * check whether character i is over 'Z' after circulate
   * if i+coding is over character 'Z' back to'A'and continue to circulate
   * otherwise sign the value of i after circulate the number of coding
   * return character j to main method
   */
  /**
   @param i the character from main method 
   @param coding the integer number for circulation
   @return char j the character after circulation 
    **/
  static char CodingForCL(char i, int coding){ 
	  char j=' '; 
	  if(i+coding>'Z'){   
		   j=(char)(i+coding-26);
	  }else{
		  j=(char)(i+coding);
	  }
	  return j;  
  }

  /*
   * method for convert integer to binary number, and return type is String
   * define binary as a String
   * the repetition to repeat the loop when i does not equal to 0
   * define reminder as an integer and sign 0 to it
   * sign the rest value to reminder after i over 2
   * sign half of original value of i to i
   * sign the value of reminder to the left of binary
   * define j as an integer and sign the length of binary to it
   * check the length of binary whether is 8 or not
   * the loop for adding the length of binary to 8 digits
   * add '0' to the left of binary
   * return binary to main method
   @param n the integer number
   @return String the binary format of the integer number
   */
   /**
    @param n the integer number
    @return String the binary format of the integer number
    **/
  static String int2Binary(int n){  
      int i=n;  
      String binary=""; 
      while(i!=0){  
         int reminder=0; 
         reminder=i%2;  
         i/=2;  
         binary=reminder+binary;  
      }
      int j=binary.length();  
      if(j!=8){  
         for(int k=1;k<=8-j;k++){  
            binary="0"+binary;
         }
      }
      return binary;  
   }

}
