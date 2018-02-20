
public class Method {
  public static void main(String[] args){
	  System.out.println(random());
  }
  static int random(){
	  double i=Math.random()-0.5;
	  if(i>0){
		  return 1;
	  }else if(i==0){
		  return 0;
	  }else{
		  return -1;
	  }
  }
}
