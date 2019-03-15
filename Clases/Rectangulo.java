public class Rectangulo{
    //Atributos
    double largo;
    double alto;

    //Constructor SOBRECARGA
    Rectangulo(){}

    Rectangulo(double alto){}

    Rectangulo(int largo){}

    Rectangulo(double alto, double largo){
        this.alto = alto;
        this.largo = largo;
    }

    //Metodos
    
    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea(){
        return largo * alto;
    }

    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo(20,10);

        /*rec1.setAlto(10);
        rec1.setLargo(20);*/

        System.out.print("El area es: " + rec1.calcularArea());
    }

}