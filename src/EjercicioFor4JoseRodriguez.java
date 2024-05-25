public class EjercicioFor4JoseRodriguez {
    private String nombre;

    public EjercicioFor4JoseRodriguez(String nombre) {
        this.nombre = nombre;
    }
    public int f(int numero1, int numero2) {

        for (int i = 1; i <= numero1; i++) {
            numero2 = numero2*i;
            System.out.println(numero2);
        }
        return numero1;
    }
}
