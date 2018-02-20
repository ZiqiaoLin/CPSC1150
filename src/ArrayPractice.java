
public class ArrayPractice {
    public static void main(String[] args){
    	int[] studentsGrade={10,20,30,40,50,60,70,80,90,100};
    	for (int i=0;i<studentsGrade.length;i++){
    		System.out.println("the student number"+(i+1)+"is"+studentsGrade[i]);
    		int x=30;
    		int [] arr= new int[x];
    		x=60;
    		System.out.println(x);
    		System.out.println(arr.length);
    	
    	}
    	for(int i:studentsGrade){
    		System.out.println(i);
    	}
    	System.out.print(meanArray(studentsGrade));
    }
    public static int meanArray(int [] studentsGrade){
    	int sum=0;
    	for(int i=0;i<studentsGrade.length;i++){
    		sum+=studentsGrade[i];
    	}
    	return sum/studentsGrade.length;
    }
}
