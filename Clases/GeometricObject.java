import java.util.Date;
public class GeometricObject{
    //Atributos
    private String color;
    private boolean filled;
    private Date dateCreated;

    //CONSTRUCTOR
    public GeometricObject(){}
    public GeometricObject(String color, boolean filled){
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
          "filled: " + filled;
      }

      public static void main(String[] args) {
        
        Circle2 circulito1 = new Circle2();
        Circle2 circulito2 = new Circle2(23.5);
        Circle2 circulito3 = new Circle2(23.5,"RED",true);

        Rectangle2 rectangulito1 = new Rectangle2();
        Rectangle2 rectangulito2 = new Rectangle2(15.3,30.5);
        Rectangle2 rectangulito3 = new Rectangle2(15.3,30.5,"BLUE",false);

      }

}