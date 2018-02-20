public class Args{
  public static void main (String[] args) {
	  String argument1="", argument2="";
	  if (args.length < 2){
		  System.out.println("Input 2 arguments");
		  System.exit(0);
	  } else {
		  argument1 = args[0];
		  argument2 = args[1];
		  System.out.println(args[0]+"+"+args[1]);
	  }
  }
}