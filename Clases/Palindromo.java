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

    public void cambiarPalabra(){
        String palabraCambiada;
        int longitud = palabra.length();
        while(longitud <= 0){
            palabraCambiada += palabra.charAt(longitud-1);

        }
    }



}