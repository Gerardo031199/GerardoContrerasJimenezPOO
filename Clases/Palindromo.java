import java.util.Scanner;
class Palindromo{
    private String palabra;

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String cambiarPalabra(){
        String palabraCambiada = "";
        int longitud = palabra.length();
        while(longitud > 0){
            palabraCambiada += palabra.charAt(longitud-1);
            longitud--;

        }
        return palabraCambiada;
    }

    public void evaluarPalabras(String palabra2){
        if(palabra.equalsIgnoreCase(palabra2)){
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");

        }

    }

    public static void main(String[] args) {
        Palindromo p = new Palindromo();
        Scanner scanner = new Scanner(System.in);
        String aux = "";
        int opc = 0;
        while(opc != 3){
            System.out.println("-----Palindromos---- \n" + "1 Pedir palabra \n" + "2 Evaluar palabra \n" + "3 Salir");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Introduce la palabra");
                    aux = scanner.next();
                    break;

                case 2:
                    p.setPalabra(aux);
                    String cambiada = p.cambiarPalabra();
                    p.evaluarPalabras(cambiada);
                    break;
            
                default:
                    System.out.println("Hey tu lee el menu");
                    break;
            }
        }
    }
}