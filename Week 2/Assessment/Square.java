package Week2.Assignment.pojo;

public class Square extends Rectangle{
	Square(String color, int side) 													// Constructor 
    {
        super(color, side, side);
    }

    @Override
    public double calculateArea() 													// Calculating Area 
    {
        return super.length * super.width;
    }

}
