package Week2.Assignment.pojo;

public class Triangle implements IShape {
	int height, base;
    String color;

    Triangle(String color, int height, int base)                                                            // Constructor 
    {
        this.color = color;
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea()                                                                           // Calculating Area
    {
        return this.height * this.base;
    }

    @Override
    public double calculatePerimeter()                                                                      // Calculating Perimeter
    {
        return (this.height + this.base) + Math.sqrt(this.height ^ 2 + this.base ^ 2);
    }

}
