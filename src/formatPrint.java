
public class formatPrint {
   public static void main(String[] args){
	   char[] array={'a','b','c','d','e','f'};
	   int x=1;
	   double  i=3.1415926;
	   System.out.printf("This one is %6.2f",i);
	   System.out.println(x++ +1+ ++x);
	   System.out.println("---------");
	   System.out.println(x);
	   for(int j=0;j<array.length;j++){
		   array[j++]=(char)(array[j]+ ++j);
	   }
	   for(int j=0;j<array.length;j++){
		   System.out.println(array[j]);
	   }
   }
  
}
