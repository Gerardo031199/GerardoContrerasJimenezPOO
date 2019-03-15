public class Circle2 extends GeometricObject{
    //Atributos
    private double radius;

    public Circle2(){}
    public Circle2(double radius){}
    public Circle2(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
    }
    public double getArea(){
        return area;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getDiameter(){
        return diameter;
    }
}