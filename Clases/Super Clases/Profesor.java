public class Profesor{
    //Atributos
    private int materias;

    //Constructores
    Profesor(){}
    Profesor(int materias){}
    Profesor(int materias, int edad, String nombre){
        super(edad, nombre);
        this.materias = materias;
    }

    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }


}