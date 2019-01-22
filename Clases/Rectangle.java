public class Rectangle{
    //atributos
    double area;
    double length;
    double perimeter;
    double width;

     //Metodos
     public void calcArea(){
    }

     public void calPerimeter(){

    }

    public double getArea(){
        return 0.0;
    }

    public double getPerimeter(){
        return 0.0;
    }
    public void setLength(double length){
    
    }

    public void set(double width){

    }

    public static void main(String[] args) {
        
        Rectangle rectangle1= new Rectangle();
        Rectangle rectangle2= new Rectangle();
        Rectangle rectangle3= new Rectangle();
        
        rectangle1.width=4.1d;
        rectangle2.width=9d;
        rectangle3.width=12d;
        
    
        rectangle1.calcArea();
        rectangle2.calcArea();
        rectangle3.calcArea();

        System.out.println("El area de  rectangle1 es: "+ rectangle1.getArea());
        System.out.println("El area de  rectangle2 es: "+ rectangle2.getArea());
        System.out.println("El area de  rectangle3 es: "+ rectangle3.getArea());

        rectangle1.calPerimeter();
        rectangle2.calPerimeter();
        rectangle3.calPerimeter();
    
        System.out.println("El perimetro de  rectangle1 es: "+ rectangle1.getPerimeter());
        System.out.println("El perimetro de  rectangle2 es: "+ rectangle2.getPerimeter());
        System.out.println("El perimetro de  rectangle3 es: "+ rectangle3.getPerimeter());
            
        
    }
}