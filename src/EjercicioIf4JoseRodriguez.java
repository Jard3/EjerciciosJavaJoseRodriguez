public class EjercicioIf4JoseRodriguez {
    private String nombre;

    public EjercicioIf4JoseRodriguez(String nombre) {
        this.nombre = nombre;
    }

    public int a(int año) {
        int resultado = 1;
        if (año%4 ==0) {resultado=0;}
        else {resultado =1;}
        return resultado;}
}
