public class EjercicioForJoseRodriguez {
    private String nombre;

    public EjercicioForJoseRodriguez(String nombre) {
        this.nombre = nombre;
    }
    public int p(int num) {

        for (int i = 0; i < num; i+=2) {
            num=num+2;
            System.out.println(num);
        }
        return num;
    }
}
