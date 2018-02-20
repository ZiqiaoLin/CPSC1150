import java.util.Scanner;
public class Hex2Dec {
   public static void main(String []args){
	   Scanner input= new Scanner(System.in);
	   System.out.print("please input an hexidecimal number:");
       String s=input.nextLine();
       System.out.println(hex2Dec(s));
  }
   static int hex2Dec(String s){
	   int dec=0;
	   for(int i=0;i<s.length();i++){
		   dec+=hexChar2Dec(s.charAt(i))*Math.pow(16, s.length()-1-i);
	   }
	   return dec;
   }
   static int hexChar2Dec(char c){
	   if(c>='A'&&c<='F'){
		  return c-'A'+10;
	   }else{
		   return c-'0';
	   }
   }
}