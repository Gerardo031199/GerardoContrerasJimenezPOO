import java.util.Scanner;

public class Estudiante {
    // Atributos
    public String nombre;
    public double annioNacimiento;
    public short ANNIO=2019;

    public double obtenerEdad() {
        return ANNIO-annioNacimiento;
    }
    public String toString(){
        return "Nombre " + nombre + "\n edad " + obtenerEdad()+ "annio " + "\n annio Nacimiento " + annioNacimiento;
    }

    //Metodos
    
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in); 
    
    Estudiante edad1 = new Estudiante();
    System.out.println("Escribe tu nombre ");
    edad1.nombre = scanner.next();

    System.out.println("Ingresa tu annio de nacimiento: " );
    edad1.annioNacimiento = scanner.nextDouble();


    double edad = edad1.obtenerEdad();
    System.out.println(edad1.toString());

    }

}