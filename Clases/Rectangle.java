public class Rectangle{
    //atributos
    double area;
    double length;
    double perimeter;
    double width;

     //Metodos

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }
    public void setLength(double length){
    
    }

    public void setWidth(double width){

    }

    public void calcArea(){
        area = (length * width);
    }

    public void calPerimeter(){
        perimeter = ((length + width)*(2));
    }
    public static void main(String[] args) {
        
        Rectangle rectangle1= new Rectangle();
        Rectangle rectangle2= new Rectangle();
        Rectangle rectangle3= new Rectangle();
        
        rectangle1.width=4.1;
        rectangle2.width=9;
        rectangle3.width=12;

        rectangle1.length=4;
        rectangle2.length=7;
        rectangle3.length=5;
        
    
        rectangle1.calcArea();
        rectangle2.calcArea();
        rectangle3.calcArea();

        System.out.println("El area de  rectangulo 1 es: "+ rectangle1.getArea());
        System.out.println("El area de  rectangulo 2 es: "+ rectangle2.getArea());
        System.out.println("El area de  rectangulo 3 es: "+ rectangle3.getArea());

        rectangle1.calPerimeter();
        rectangle2.calPerimeter();
        rectangle3.calPerimeter();
    
        System.out.println("El perimetro de  rectangulo 1 es: "+ rectangle1.getPerimeter());
        System.out.println("El perimetro de  rectangulo 2 es: "+ rectangle2.getPerimeter());
        System.out.println("El perimetro de  rectangulo 3 es: "+ rectangle3.getPerimeter());
            
        
    }
}