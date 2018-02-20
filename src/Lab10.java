/*The Program's Name:Lab10;
**Name: Ziqiao(John) Lin;
**Date of Finish: Nov,27,2015;
**Course:CPSC1150;
**Section:004;
**Compiler:JDK1.7;
*/
import java.util.*;    //import java Scanner and PrintWriter function
import java.io.*;
/*
 *  class Lab10 is to sort a file as alphabet sequence and print them out
 */
public class Lab10 {
	/*
	 * main method
	 */
	final static int ESTIMATE_SIZE=10000;  //define ESTIMATE_SIZE as a constant
		public static void main (String[] args)throws FileNotFoundException{
			String sFileName = "unsorted.txt";	    // Filename "unsorted.txt"
	        
			File myInFile = new File(sFileName);   // define myInFile as unsorted.txt
			if (!myInFile.exists()){    // check whether myInFile exists or not
				System.out.println("File "+ sFileName + " not found");  
				return;
			}	
         String[] str1= new String[ESTIMATE_SIZE];  //define str1 as String
         String[] str2= new String[ESTIMATE_SIZE];  //define str2 as String
			Scanner input = new Scanner(myInFile);  // define input as a Scanner and read myInFile
	       str1= printFile(input);  
	        
	          str2=filter(str1);
              print(str2);
			input.close();  
		}
        /*
         * method printFile is to read context from file and transfer to String array, return String array str
         */
      public static String[] printFile(Scanner input)throws FileNotFoundException{  
         String[] str=new String[ESTIMATE_SIZE];  // define a new String array str
    	 String temp="";   
         String lowercase="";
         while(input.hasNext()){
            temp+=input.next()+" ";  // read all context and transfer to temp
         }
         lowercase=temp.toLowerCase();  // lowercase message
         str=lowercase.split(" ");  // split all words and save them into str String array
         return str;  // return str
         }      
         /*
          *  method filter is to remove all punctuation symbol at the beginning and end and then ignore all words with numbers, other punctuation
          */
      public static String[] filter(String[] str){
    	  int count=0;  // define count as an integer and sing to 0
    	   String[] str2= new String[str.length];  // define a new String array
    	  for(int i=0;i<str.length;i++){  // check all words in String array str
    		boolean judge=true;   // define judge as a boolean type and set to true
            String temp=str[i];   
            String temp2 ="";
            if((temp.charAt(0)<'a'||temp.charAt(0)>'z')&&(temp.charAt(0)<'0'||temp.charAt(0)>'9')){	 // selection for first character whether is punctuation or not
            	if((temp.charAt(temp.length()-1)<'a'||temp.charAt(temp.length()-1)>'z')&&(temp.charAt(temp.length()-1)<'0'||temp.charAt(temp.length()-1)>'9')){  // selection for last character whether is punctuation or not
            			for(int j=1;j<temp.length()-1;j++){
            				temp2=temp2+temp.charAt(j);  // set temp2 from the second character to the one before the last
            			}
            		}else{
            			for(int j=1;j<temp.length();j++){
            				temp2=temp2+temp.charAt(j);  // set temp2 from the second character to the last
            			}
            		}
            }else{
            		if((temp.charAt(temp.length()-1)<'a'||temp.charAt(temp.length()-1)>'z')&&(temp.charAt(temp.length()-1)<'0'||temp.charAt(temp.length()-1)>'9') ){  // selection for last character whether is punctuation or not
            			for(int j=0;j<temp.length()-1;j++){
            				temp2=temp2+temp.charAt(j);  // set temp2 from the second character to the one before the last
            			}
            		}else{
            			for(int j=0;j<temp.length();j++){
            				temp2=temp2+temp.charAt(j); // set temp2 from the second character to the last
            			}
            		}
            	}
            if(temp2!=""){  
    		   for(int k=0;k<temp2.length();k++){  // check every character in temp2 whether they have any number or punctuation
    			   if(temp2.charAt(k)<'a'||temp2.charAt(k)>'z'){  
    				   if(temp2.charAt(k)!='-'){
    					   judge=false;
    					   break;
    				   }
    			   }
    		   }
    		   for(int z=0;z<str2.length;z++){  // clear all the words that have one already
    			   if(temp2.equals(str2[z])){
    				   judge=false;
    				   break;
    			   }
    		   }
    		   if(judge){  // the word after selection save into str2
    			   str2[count++]=temp2;
    		   }
            }
    	  }
    	  quickSort(str2,count-1);  // calling quickSort method
    	  return str2;  // return str2
      }
      /*
       * method quickSort to sort all words for alphbet sequence
       */
    public static void quickSort(String[] str, int count){  
    	  qSort(str,0,count);
     }
    public static void qSort(String[] str,int low, int high){  //method for quicksort
    	if(low<high){  //condition for quicksort
    		int pivot=partition(str,low,high);  // define pivot for integer type and calling method partition
    		qSort(str,low,pivot-1);
    		qSort(str,pivot+1,high);
    	}
    }
    /*
     * method partition to put all number that smaller than pivot to left side and put all larger number to right side
     */
    public static int partition(String[] str,int low,int high){
    	String pivot=str[low];  // define pivot
    	while(low<high){ // condition low is less than high
    		while(low<high&&(int)str[high].compareTo(pivot)>=0){
    			--high;
    		}
    		str[low]=str[high];
    		while(low<high&&str[low].compareTo(pivot)<=0){
    			++low;
    		}
    		str[high]=str[low];
    	}
    	str[low]=pivot;
    	return low;  //return low
    }
    /*
     * method print to print all characters in a String array
     */
    public static void print(String [] str)throws FileNotFoundException{
    	for(int i=0;i<=str.length;i++){  // repetition from index 0 to index length-1
    		if(str[i]!=null){  //if the character is not null
    			System.out.println(str[i]);  // print out the result
    		}else{
    			break;  //otherwise break the String
    		}
    	}
    }	 
}

 