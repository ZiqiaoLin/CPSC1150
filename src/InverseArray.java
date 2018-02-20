
public class InverseArray {
  public static void main(String[] args){
	  int[] numbers=new int[10];
	  for(int i=0;i<numbers.length;i++){
		  numbers[i]=(int)(Math.random()*99+1);
	  }
	  for(int i=0;i<numbers.length;i++){
		  System.out.print(numbers[i]+"\t");
	  }
	  System.out.print("\n");
	  int[] temp=new int[numbers.length];
	  for(int i=0,j=numbers.length-1;i<numbers.length;i++,j--){
		  temp[j]=numbers[i];
	  }
	  for(int i=0;i<temp.length;i++){
		  System.out.print(temp[i]+"\t");
	  }
	  System.out.print("\n");
	  int[] tempNumber=new int[numbers.length];
	  tempNumber=numbers;
	  for(int i=0;i<tempNumber.length;i++){
		  System.out.print(tempNumber[i]+"\t");
	  }
	  System.out.print("\n");
	  for(int i=0;i<numbers.length/2;i++){
		  int temporary;
		  temporary=numbers[i];
		  numbers[i]=numbers[numbers.length-1-i];
		  numbers[numbers.length-1-i]=temporary;
	  }
	  for(int i=0;i<numbers.length;i++){
		  System.out.print(numbers[i]+"\t");
	  }
  }
}
