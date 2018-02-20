import java.io.*;
import java.util.*;
public class Text_IO {
  public static void main(String[] args)throws FileNotFoundException {
	  System.out.println("Please input an name of the file:");
	  String filename=args[0];
	  char c='b';
	  System.out.println(filename);
	  File myfile= new File(filename);
	  if (!myfile.exists()){
		  System.out.println("file does not exist");
		  return;
	  }
	  PrintWriter output=new PrintWriter(myfile);
	  output.print("This is John");
	  output.print("I want to say this method is like shit!");
	  output.println(90);
	  output.println("last word I wan to say");
	  output.print(c);
	  output.close();
  }
}
