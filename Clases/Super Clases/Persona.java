public class Persona{
    //Atributos
    private int edad;
    private String nombre;

     //Constructores
     Persona(){}
     Persona(int edad, String nombre){
         this.edad = edad;
         this.nombre = nombre;
     }
 
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante(1,19,"Luis");

        Profesor profe1 = new Profesor();
        Profesor profe2 = new Profesor(5,19,"Aldo");
    }
   


}