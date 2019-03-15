import java.util.Scanner;

public class Tablas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int opc = 0;
        int cont = 0;
        int num = 0;


        do{
            System.out.println("Tabla que desea ver:");
            opc = scanner.nextInt();
            switch(opc){
                case 1:
                    num = opc * cont;
                    System.out.println(opc + "x" + cont + "=" + num);
                    while(cont < 10);
                    break;

                case 2:
                    num = opc * cont;
                    System.out.println(opc + "x" + cont + "=" + num);
                    while(cont < 10);
                    break;

                case 3:
                    num = opc * cont;
                    System.out.println(opc + "x" + cont + "=" + num);
                    while(cont < 10);
                    break;

                case 4:
                    num = opc * cont;
                    System.out.println(opc + "x" + cont + "=" + num);
                    while(cont < 10);
                    break;

                case 5:
                    num = opc * cont;
                    System.out.println(opc + "x" + cont + "=" + num);
                    while(cont < 10);
                    break;

                case 6:
                    num = opc * cont;
                    System.out.println(opc + "x" + cont + "=" + num);
                    while(cont < 10);
                    break;
                
                case 7:
                    num = opc * cont;
                    System.out.println(opc + "x" + cont + "=" + num);
                    while(cont < 10);
                    break;

                case 8:
                    num = opc * cont;
                    System.out.println(opc + "x" + cont + "=" + num);
                    while(cont < 10);
                    break;

                case 9:
                    num = opc * cont;
                    System.out.println(opc + "x" + cont + "=" + num);
                    while(cont < 10);
                    break;

                case 10:
                    num = opc * cont;
                    System.out.println(opc + "x" + cont + "=" + num);
                    while(cont < 10);
                    break;

                default: 
                    System.out.println("Error");
                
            }
        }while(opc != 11);
    }
}