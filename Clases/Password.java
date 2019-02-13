public class Password{
    //Atributos
    private int logitud;
    private String password;

    /**
     * @return the logitud
     */
    public int getLogitud() {
        return logitud;
    }

    /**
     * @param logitud the logitud to set
     */
    public void setLogitud(int logitud) {
        this.logitud = logitud;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean esFuerte(){
        if(password.length() <8) {
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        Password p1 = new Password();

        p1.setPassword("Holagerardo");

        if(p1.esFuerte()){
            System.out.println("Es fuerte");
        }else{
            System.out.println("Cambia tu contrasena te pueden hackear");
        }
    }
}