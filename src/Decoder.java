/*The Program's Name:Decoder;
**Name: Ziqiao(John) Lin;
**Date of Finish: Oct,29,2015;
**Course:CPSC1150;
**Section:004;
**Compiler:JDK1.7;
*/
import java.util.Scanner;  // import Scanner function

public class Decoder{
	/*
	 * main class to translate binary message to normal message after circulating all 
	 * numbers and characters back
	 */
  public static void main(String []args){  // main method
    /**
     @param binary the binary message from user
     @param inputCode the integer from user for circulation
     @param i the number of 8digits-characters for binary message  
     **/
     Scanner input= new Scanner(System.in);  // define input as a new Scanner
     System.out.print("Input Message:");// notice user to input a String
     String binary=input.nextLine();// define binary as a String and sign the message for user's input to it
     System.out.print("Input Code :"); // notice user to input a code
     int inputCode=input.nextInt();  // define inputCode as an integer and sign it the user's input
     int i=binary.length()/8;  // define i as an integer and sign the number of character to it
     String afterdecode=""; // define afterdecode as a String and initialize it
     System.out.print("The Original Message: ");
     for (int j=0;j<i;j++){ // the loop to go through every character
         afterdecode+=decoding(binary2Int(binary,j),inputCode);  // calling binary2Int method to convert binary to decimal integer 
         //calling decoding method to circulate the number and character back and convert to normal message and sign it back to aftercoder
         }
     System.out.print(afterdecode);  // print out the String aftercode
      }
  
  /*
   * method decoding it to change integer number to character and circulate if the character to number or small letters or capital letters
   * data type casting change integer to character
   *  loop to check whether character is a number or small letters and capital letters
   * nested loop to check whether number small letters and capital letters are over their top after decoding circulation
   * return s as a character to main method
   */
  /**
   @param integer the decimal number for character
   @param inputCode the number for circulation
   @return char s the character after circulation
   **/
  static char decoding(int integer, int inputCode){ 
	  char s=(char)integer;  
	  if(s>='A'&&s<='Z'){ 
		  if((char)(s-inputCode)<'A'){ 
			  s=(char)(s-inputCode+26);  
		  }else{
			  s=(char)(s-inputCode);
		  }
	  }else if(s>='a'&&s<='z'){ 
		  if((char)(s-inputCode)<'a'){ 
			  s=(char)(s-inputCode+26);
		  }else{
			  s=(char)(s-inputCode);
		  }
	  }else if(s>='0'&&s<='9'){  
		  if((char)(s-inputCode)<'0'){
			  s=(char)(s-inputCode+10);
		  }else{
			s=(char)(s-inputCode);  
		  }
	  }
	  return s; 
  }
  
  /*
   * method binary2Int to convert binary to integer
   * set decimalnumber as integer and convert binary number to decimal integer
   * return decimalNumber to main method
   */
  /**
  @param binary the binary string for character
  @param i the location of start point for binary string
  @return in decimalNumber the decimal number of 8 digits of decimal number
   **/
  static int binary2Int(String binary,int i){  
       int n=i;  
       int decimalNumber=0;  
       for(int k=0;k<8;k++){
            decimalNumber+=(int)(binary.charAt(8*n+k)-'0')*Math.pow(2,7-k);
         }
       return decimalNumber;  // return decimalNumber to main method
     }

}