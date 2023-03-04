abstract class Shape
{
    double area;
    protected String color;
    double parameter;
    static String type;
    
    public double calArea() {
		return area;
	}
 
    
    public double calParameter()
    {
    	return parameter;
    }
    void setColor(String col)
    {
        color = col;
    }
    String getColor()
    {
        return color;
    }
    public abstract void drawShape();
    
}

class Rectangle extends Shape
{
    private double height;
	private double width;
    Rectangle(double height, double width, String color, String type)
    {
        this.height = height;
        this.width = width;
        this.color = color;
        Shape.type = type;
    }
    
    public double calArea()
    {
        return height*width;
    }
    
    public double calParameter()
    {
		return 2*(height + width);
    }
    @Override
    public void drawShape()
    {
        System.out.println("Draw Rectangle with color "+ color);
    }
    public void findType()
    {
        System.out.println("Shape type "+type);
    }
}
class Square extends Shape
{
    private double side;
    Square(double side, String color, String type)
    {
        this.side = side;
        this.color = color;
        Shape.type = type;
    }
    
    public double calArea()
    {
        return side*side;
    }
    
    public double calParameter()
    {
		return 4*side;
    }
    @Override
    public void drawShape()
    {
        System.out.println("Draw Square with color "+ color);
    }
    public void findType()
    {
        System.out.println("Shape type "+type);
    }
}

class Circle extends Shape
{
    private double radius;
    static double pi = 3.14;
    Circle(double radius, String color, String type)
    {
        this.radius = radius;
        this.color = color;
        Shape.type = type;
    }
    
    public double calArea()
    {
        return pi*radius*radius;
    }
    
    public double calParameter()
    {
		return 2*pi*radius;
    }
    @Override
    public void drawShape()
    {
        System.out.println("Draw Circle with color "+ color);
    }
    public void findType()
    {
        System.out.println("Shape type "+type);
    }
}


public class Main
{
    public static void main (String[] args) {
    Rectangle rect = new Rectangle(100, 200, "Red", "Rectangle");
    System.out.println("Area of Rectangle is: "+rect.calArea());
    System.out.println("Parameter of Rectangle is: "+rect.calParameter());
    rect.drawShape();
    rect.findType();
    System.out.println();
    Square squ = new Square(200, "Green", "Square");
    System.out.println("Area of Square is: "+squ.calArea());
    System.out.println("Parameter of Square is: "+squ.calParameter());
    squ.drawShape();
    squ.findType();
    System.out.println();
    Circle cir = new Circle(50, "Blue", "Circle");
    System.out.println("Area of Circle is: "+cir.calArea());
    System.out.println("Parameter of Circle is: "+cir.calParameter());
    cir.drawShape();
    cir.findType();
    }
}
