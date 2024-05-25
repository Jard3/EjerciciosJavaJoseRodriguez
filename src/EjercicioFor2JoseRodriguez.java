public class EjercicioFor2JoseRodriguez {
    private String nombre;

    public EjercicioFor2JoseRodriguez(String nombre) {
        this.nombre = nombre;
    }
    public int x(int numero) {

        for (int i = 0; i <= 10; i++) {

            System.out.println(numero*i);
        }
        return numero;
    }
}
