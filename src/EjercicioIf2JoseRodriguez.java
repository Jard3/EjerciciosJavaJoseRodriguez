public class EjercicioIf2JoseRodriguez {
    private String nombre;

    public EjercicioIf2JoseRodriguez(String nombre) {
        this.nombre = nombre;
    }
    public int n(int numero) {
        int resultado = 1;
        if (numero % 2 == 0) {
            resultado = 0;
        } else {
            resultado = 1;
        }


        return resultado;
    }
}