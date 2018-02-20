
public class Exercise14 {
	public static void main(String[] args){

		for(char i='e';i>='a';i--){
			for(int j=0;j<=(int)('e'-i);j++){
				System.out.print(" ");
			}
			for(char j='a';j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
