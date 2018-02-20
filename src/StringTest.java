import java.util.Scanner;
public class StringTest {
   public static void main(String[] args){
	   String s="Java";
	   s="html";
	   System.out.println(s);
	   String s1 = "Welcome to Java";
	   String s2 =s1.substring(0,11)+"HTML";
	   System.out.println(s2);
	   String mystr="10002 3 453445";
	   Scanner input= new Scanner(mystr);
	   input.useDelimiter("3");
	   while(input.hasNextInt()){
		   System.out.println(input.next());
	   }
   }
}
