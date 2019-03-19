import java.util.*;
public class Promedio{
    
    public static void main(String[] args) { 
    
    double sumatoria=0;
    double promedio;

    Scanner scanner = new Scanner (System.in);
    System.out.println("Cuantas calificaciones vas a promediar?");
    double n = scanner.nextDouble();

    
    for(int i = 0;i < n;i++){ 
    
    System.out.println("Ingrese la calificacion: "+ (i+ 1));
    double aux = scanner.nextDouble();
    sumatoria = sumatoria + aux;

    }
    promedio = sumatoria/n;
    System.out.println("El promedio de los numeros es: " + promedio);
    }
}