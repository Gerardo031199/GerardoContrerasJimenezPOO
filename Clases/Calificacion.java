import java.util.Scanner;
public class Calificacion{
    //Atributos
    private double promedio;
    private int numeroCalificaciones;

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    /**
     * @return the calificaciones
     */
    public int getNumeroCalificaciones() {
        return numeroCalificaciones;
    }

    /**
     * @param calificaciones the calificaciones to set
     */
    public void setNumeroCalificaciones(int NumeroCalificaciones) {
        this.numeroCalificaciones = NumeroCalificaciones;
    }
    
    //Metodos

    public void calcularPromedio(double sumaria){
        promedio = sumaria /  numeroCalificaciones;

    }

    public static void main(String[] args) {
        Calificacion c = new Calificacion();

        Scanner scanner = new Scanner (System.in);
        System.out.println("Cuantas calificaciones vas a promediar");
        int n = scanner.nextInt();
        c.setNumeroCalificaciones(n);
        double sumatoria = 0;
        for (int i = 0; i < c.getNumeroCalificaciones(); i++){
            System.out.println("Ingrese la calificacion: " + (i+ 1));
            double aux = scanner.nextDouble();
            sumatoria = sumatoria + aux;

        }
        c.calcularPromedio(sumatoria);

        System.out.println("El promedio es: " + c.getPromedio());

    }
}