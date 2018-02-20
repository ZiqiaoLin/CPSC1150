public class Random{
	static int returnValue(){
		double r=Math.random()-0.5;
		if (r>0){
			return 1;
		}else if (r==0){
			return 0;
		}else {
			return -1;
		}
	}
	public static void main(String[] args){
		System.out.println(returnValue());
	}
}

