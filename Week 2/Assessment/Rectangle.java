package Week2.Assignment.pojo;

public class Rectangle implements IShape{
	int length, width;
    String color;

    Rectangle(String color, int length, int width) 										 
	{
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() 														
	{
        return this.length * this.width;
    }

    @Override
    public double calculatePerimeter() 												 
	{
        return 2 * (this.length + this.width);
    }
}
