package Week2.Assignment.pojo;

public class HomeScreen {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle("Red",4,5);                                             
		System.out.println("Perimeter of rectangle is : " + rectangle.calculatePerimeter());        
		System.out.println("Area of rectangle is : " + rectangle.calculateArea());                   
		IShape.renderer.draw();                                                                   
		IShape.renderer.draw("This is a rectangle");                                              

		System.out.println();                                                                        



		Square square = new Square("Blue",10);                                                       

		System.out.println("Area of square is : " + square.calculateArea());                         
		IShape.renderer.draw();                                                                   
		IShape.renderer.draw("This is a square");                                                
		
		System.out.println();                                                                       



		Circle circle = new Circle("Green",5);                                                      

		System.out.println("Perimeter of circle is : " + circle.calculatePerimeter());						 
		System.out.println("Area of circle is : " + circle.calculateArea());						
		IShape.renderer.draw();																	
		IShape.renderer.draw("This is a circle");												

		System.out.println();																		


		
		Triangle triangle = new Triangle("Yellow",7,8);												

		System.out.println("Perimeter of triangle is : " + triangle.calculatePerimeter());			
		System.out.println("Area of triangle is : " + triangle.calculateArea());					 
		IShape.renderer.draw();																	
		IShape.renderer.draw("This is a triangle");												

		System.out.println();
	}

}
