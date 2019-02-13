import java.util.Scanner;
public class Persona{
    //Atributos
    private String nombre;
    private int edad;
    private String rfc;
    private char sexo;
    private double peso;
    private double altura;

    //Metodos
    public int calcularImc(){
        double imc = peso / Math.pow(altura,2);
        int res = 0;

        if (imc < 20){
            res (-1);
            System.out.println("Tu IMC es: "+imc+" \n Usted tiene peso Bajo");
        }
        else if (imc <=20 && imc <=25){
            res (0);
            System.out.println("Tu IMC es: "+imc+" \n Usted tiene peso normal");
        }
        else {
            res (1);
            System.out.println("Tu IMC es: "+imc+" \n Usted tiene sobrepeso");
        }
        return res;
    }

    public boolean esMayorDeEdad(){
        boolean mayor = false;
        if (edad >= 18)
            mayor = true;
        return mayor;
    }

    public String toString(){
        return ("Nombre " + nombre + 
                "\n Tu  edad es: " + edad +
                "\n Tu RFC es: " + rfc + 
                "\n Tu sexo es: " + sexo +  
                "\n Tu peso es: " + peso + 
                "\n Tu altura es:" + altura);
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setRfc(String rfc){
        this.rfc = rfc;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }



    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getRfc(){
        return rfc;
    }

    public char getSexo(){
        return sexo;
    }

    public double getPeso(){
        return peso;
    }

    public double getAltura(){
        return altura;
    }


    public static void main(String[] args){
    
    
    Persona persona1 = new Persona();
    
    
    System.out.println("Ingresa tu nombre: ");
    Scanner scanner = new Scanner(System.in); 
    Strimg n = scanner.next();

    System.out.println("Ingresa tu edad: ");
    int e = scanner.nextInt();

    System.out.println("Ingresa tu rfc: ");
    String r = scanner.nextInt();

    System.out.println("Ingresa tu peso: ");
    double p = scanner.nextInt();


    System.out.println("Ingresa tu altura: ");
    double a = scanner.nextInt();
    
    System.out.println(persona1.toString());
    System.out.println("Usted es mayor de edad: "+persona1.esMayorDeEdad());
    persona1.calcularImc();
    
    }
    
}