import java.util.*;
public class RandomLetter {
  public static void main(String[] args){
	  char[] lowerletters= new char[100];
	  initialize(lowerletters);
	  int[] count= new int['z'-'a'+1];
	  count=counter(lowerletters);
	  for(int i=0;i<count.length;i++){
		  System.out.println("The counter for "+(char)(i+'a')+" is "+count[i]);
	  }
  }
  static void initialize(char[] array){
	  for(int i=0;i<array.length;i++){
		  array[i]=(char)('a'+Math.random()*('z'-'a'+1));
	  }
  }
  static int[] counter(char[] array){
		  int[] count= new int['z'-'a'+1];
		  for(int i=0;i<array.length;i++){
			  count['z'-array[i]]++; 
		 }
		  return count;
  }
  
}
