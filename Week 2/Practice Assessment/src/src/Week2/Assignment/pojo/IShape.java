package Week2.Assignment.pojo;

public interface IShape {
	Renderer renderer = new Renderer();
	double calculateArea();
	double calculatePerimeter();
}
