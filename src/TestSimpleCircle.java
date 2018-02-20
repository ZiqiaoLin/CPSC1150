
public class TestSimpleCircle {
  public static void main(String []args){
	  SimpleCircle circle1= new SimpleCircle();
	  System.out.println("The area of the circle of radius"+circle1.radius+"is"+circle1.getArea());
  }
 }
  class SimpleCircle{
	  double radius;
	  SimpleCircle(){
		  radius=1;
	  }
      SimpleCircle(double newRadius){
    	  radius= newRadius;
      }
      double getArea(){
    	  return radius*radius*Math.PI;
      }
      double getPerimetr(){
    	  return 2*radius*Math.PI;
      }
      void setRadius(double newRadius){
    	  radius= newRadius;
      }
  }







