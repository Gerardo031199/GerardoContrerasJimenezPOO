import java.util.Scanner;

public class Operaciones{
    //Atributos
    private float a;
    private float b;

    /**
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }
    
    //Metodos
    public float sumarNumeros(){
        return a + b;
    }

    public float restarNumeros(){
        return a - b;
    }

    public float multiplicarNumeros(){
        return a * b;
    }

    public float dividirNumeros(){
        return a - b;
    }

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        Scanner scanner = new Scanner(System.in);
        float resultado = 0;
        int opc = 0;
        
        while(opc != 7) {
            System.out.println ("Eligen un numero\n"+"1 Pedir numeros\n"+"2 Sumar\n"+"3 resta\n"+"4 Multiplicar\n"+"5 Dividir\n"+"6 Resultado\n"+"7 Salir");
            opc = scanner.nextInt();     
            switch (opc) {
                case 1:
                    System.out.println("Numero 1");
                    op.a = scanner.nextInt();

                    System.out.println("Numero 2");
                    op.b = scanner.nextFloat();
                    break;

                case 2:
                    resultado = op.sumarNumeros();
                    break;
                
                case 3:
                    resultado = op.restarNumeros();
                    break;

                case 4:
                    resultado = op.multiplicarNumeros();
                    break;

                case 5:
                    resultado = op.dividirNumeros();
                    break;

                case 6:
                    System.out.println("El resultado es: "+ resultado);
                    break;

                default:
                    System.out.println("Leer el Menu");
                    break;
            }
        } 
    }
}