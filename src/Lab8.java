/*The Program's Name:Lab8;
**Name: Ziqiao(John) Lin;
**Date of Finish: Nov,12,2015;
**Course:CPSC1150;
**Section:004;
**Compiler:JDK1.7;
*/
import java.util.Scanner;  //import Scanner function
public class Lab8 {
	/*
	 * main class: to sum two numbers up with digits up to 30
	 */
   public static void main(String []args){
	   String str1;  //create str1 as a String
	   String str2;  //create str2 as a String
	   System.out.print("Please input first number:");// notice user to input first number
	   str1=reading();  // calling reading method to sign first number to str1
	   System.out.print("Please input second number:");// notice user to input second number
	   str2=reading();  // calling reading method to sign second number to str2
	   String reverse1=" "; //create String reverse1 and initialize it
	   String reverse2=" "; //create String reverse2 and initialize it
	   reverse1=reverse(str1,reverse1);  // get reverse1 by calling reverse method
	   reverse2=reverse(str2,reverse2);  // get reverse2 by calling reverse method
	   int[] array1= new int[createSpace(str1, str2)-1];  
	   int[] array2= new int[createSpace(str1, str2)-1];
	   int[] result= new int[createSpace(str1, str2)];
	   initialize(array1,reverse1);
	   initialize(array2,reverse2);
	   result=adding(array1,array2);
       System.out.println();
       output(str1,str2,result);
       System.out.println();
   }
   /*
    * method createSpace is to calculate the size for number1 number2 and result when transfer them to integer array
    */
   public static int createSpace(String str1, String str2){
	   int space;
	   if(str1.length()>=str2.length()){
		   space=str1.length()+1;
	   }else{
		   space=str2.length()+1;
	   }
	   return space;
   }
   
   /*
    * method reading is to read the input and sign them as a String
    */ 
   public static String reading(){
	   Scanner input= new Scanner(System.in);
	   String str=input.next();
	   return str;
   }
   /*
    * method reverse is to reverse the sequence of String
    */
   public static String reverse(String str, String reverse){
	   for(int i=0;i<str.length();i++){
		   reverse=str.charAt(i)+reverse;
	   }
	   return reverse;
   }
   /*
    * method initialize is to transfer number from String to integer array
    */
   public static int[] initialize(int[] array,String str){
	   for(int i=0;i<str.length()-1;i++){
		   array[i]=str.charAt(i)-'0';
	   }
	   return array;
   }
   /*
    * method adding is to sum two numbers together
    */
   public static int[] adding(int[] array1, int[] array2){
	   int[] result= new int[(array1.length>=array2.length)?array1.length+1:array2.length+1];
	   for(int i=0;i<array1.length||i<array2.length;i++){
		   if(array1[i]+array2[i]>=10){
			   result[i]=result[i]+array1[i]+array2[i]-10;
			   result[i+1]=1;
		   }else{
			   result[i]=result[i]+array1[i]+array2[i];
			   if(result[i]>=10){
				   result[i]=result[i]-10;
				   result[i+1]=result[i+1]+1;
			   }
		   }
	   }
	   return result;
   }
   /*
    * method reverseRes is to reverse Result
    */
   public static String reverseRes(int[] array){
	   String reverseArr="";
	   if(array[array.length-1]==0){
		   for(int i=0;i<array.length-1;i++){
			   reverseArr=reverseArr+array[array.length-2-i];
		   }
	   }else{
		   for(int i=0;i<array.length;i++){
			   reverseArr=reverseArr+array[array.length-1-i];
		   }
	   }
	   return reverseArr;
   }
   /*
    * the output method is going to output the result
    */
   public static void output(String str1, String str2,int[] result){
	   System.out.printf("%39s +",printFormat(str1));
	   System.out.println();
	   System.out.printf("%39s",printFormat(str2));
	   System.out.println();
	   System.out.print("------------------------------------------");
	   System.out.println();
	   System.out.printf("%39s",printFormat(reverseRes(result)));
   }
   /*
    * the method printFormat is print number as and with comma
    */
   public static String printFormat(String str){
	   String temp="";
	   for(int i=str.length()-1,count=1;i>=0;i--,count++){
		   temp=str.charAt(i)+temp;
		   if(count==3&&i!=0){
			   temp=","+temp;
			   count=0;
		   }
	  }
	  return temp;
   }
}
