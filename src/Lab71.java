/*The Program's Name:Lab71;
**Name: Ziqiao(John) Lin;
**Date of Finish: Nov,05,2015;
**Course:CPSC1150;
**Section:004;
**Compiler:JDK1.7;
*/
import java.util.*;  //import utility functions
public class Lab71 {
	/*
	 * main class: to create different kinds of methods
	 */
	public static void main(String[] args) { //main method
		int[] arrItem1 = new int[10];  // define arrItem1 as integer array and create 10 memory spaces
		int[] arrItem4 = new int[10];  // define arrItem4 as integer array and create 10 memory spaces
		int[] arrItem5 = new int [50];  // define arrItem5 as integer array and create 50 memory spaces
		char[] arrItem7 = new char[256];  // define arrItem7 as integer array and create 256 memory spaces
		int size;  //define size as an integer 
	 
		initialize(arrItem1);      // Item 1
		printArray(arrItem1);      // Item 2

			
		reverseArray(arrItem1);    // Item 3
		printArray(arrItem1);
		
		
		sumArray(arrItem1, arrItem4);  // Item 4
		printArray(arrItem4);
		
		initialize(arrItem5, 10, 20);   // Item 5
		
		
		countArray(arrItem5);    // Item 6
		
		arrItem7=getMsg();
		int n = readArray(arrItem7);  // item 7
		System.out.println(n);
		
		printOneInLine(arrItem7);  // item 8
		
	}
	
	/** Read a line of message from keyboard and return it as an array of char
	@return: Array of characters 
	*/
	public static char[] getMsg(){  //char array method getMsg to get a message from user's input
		String myMessage;
		System.out.print("Input Message: "); //notice user to start to input
		Scanner input = new Scanner(System.in);  // define input as a new Scanner
		myMessage = input.nextLine();// Read a line of message
		return myMessage.toCharArray();  
	}    
	static int[]  initialize(int[] array){  // integer array initialize to give a random value from 1 to 10
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*9+1);			
		}
		return array;
	}
	static void printArray(int[] array){  // void printArray is to print all elements from an array
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static void reverseArray(int[] array){// void reverseArray is to reverse all elements in a array
		int[] temArray= new int[array.length]; // create a new array and create same spaces as array
		for(int i=0;i<array.length;i++){
			temArray[array.length-i-1]=array[i];
		}
		printArray(temArray); // calling the printArray method
	}
	static void sumArray(int[] array1,int[] array2){ // sumArray is to sum all elements 
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<=i;j++){
				array2[i]+=array1[j];
			}
		}
		printArray(array2); // calling the printArray method
	}
	static int[] initialize(int[] array,int downLimit, int upLimit){  // overload initialize method to initialize all values from downlimits to uplimits
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*(upLimit-downLimit+1)+downLimit);
		}
		return array;  // return array 
		
	}
	static void countArray(int[] array){  //void type array countArray is to calculate all the number of occurs and print them out
		int[] count=new int[20-10+1];
		for(int i=0;i<array.length;i++){
			count[array[i]-10]++;
		}
		for(int i=0;i<count.length;i++){
			System.out.println(i+10+"occurs ="+count[i]);
		}
	}
	static int readArray(char[] array){  // int array readArray to count the number of characters in an array
		int count=0;
		for(int i=0;i<array.length;i++){
			if(array[i]!='\u0000'){
				count++;
			}else{
				break;
			}
		}
		return count;  //return count
	}
	static void printOneInLine(char[] array){ // void merhod to print all characters in an array
		for(int i=0;i<array.length;i++){  //repetition from 0 to the arr.length-1
			System.out.print(array[i]);  // print out the elemnts in i of array
		}
	}
}