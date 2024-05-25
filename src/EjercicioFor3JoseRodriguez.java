public class EjercicioFor3JoseRodriguez {
    private String nombre;

    public EjercicioFor3JoseRodriguez(String nombre) {
        this.nombre = nombre;
    }
    public int y(int numero1, int numero2) {

        for (int i = 0; i <= numero1; i+=2) {
            numero2 = numero2+i;
            System.out.println(numero2);
        }
        return numero2;
    }
}
