public class Estudiante{
    //Atributos
    private int matricula;
   
    //Constructores
    Estudiante(){}
    Estudiante(int matricula){}
    Estudiante(int matricula, int edad, String nombre){
        super (edad, nombre);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


}