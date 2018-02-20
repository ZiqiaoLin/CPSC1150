import java.util.*;
public class MyIsoStr {
  public static void main(String []args){
	  String myStr="1000 23 45 78906";
	  double dou=23452453;
	  int i=234567;
	  Scanner myScan=new Scanner(myStr);
	  while(myScan.hasNextInt()){
		  System.out.println(myScan.nextInt());		  
	  }
	  myScan.useDelimiter("1000");
      System.out.printf("mY STRING IS %3s",myStr);
      System.out.printf("my number is %7.2f",dou);
      System.out.printf("the integer number is %10d",i);
  }
}
