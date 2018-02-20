
public class StringPractice {
  public static void main(String[] args){
	  String s1="Welcome to Java";
	  String s2=new String("Welcome to Java");
	  System.out.println(s1);
	  s1="Hello";
	  System.out.println(s1);
	  String[] s3;
	  int i=100;
	  String s4="Welcome";
	  String s5="Welcome";
	  String s6= new String("Welcome");
	  System.out.println(s4==s5? true:false);
	  String t="Welcome to Java";
	  System.out.println(s1==s2);
	  System.out.println(s1.toUpperCase());
	  System.out.println(s2.toLowerCase());
	  System.out.println(s1.trim());
	  System.out.println(s1);
	  t=String.valueOf(i);
	  System.out.println(t);
	  i=Integer.parseInt(t);
	  System.out.println(i);
	  s3=s1.split("a");
	  for(int j=0;j<s3.length;j++){
		  System.out.println(s3[j]);
	  }
	  s1=s1+s2;
	  System.out.println(s1);
  }
}
