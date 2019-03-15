public class Rectangle2 extends GeometricObject{
    //Atributos
    private double width;
    private double height;
    
     //Metodos
    Rectangle2(){}
    Rectangle2(double width, double height){}
    Rectangle2(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {  
        this.width = width; 
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {   
        this.height = height;
    }
     
    public double getArea() {
        return area;
    }
    
        System.out.println (Rectangle2);
        System.out.println (rectangle2.getArea());
        System.out.println (rectangle2.getColor());

    }
}