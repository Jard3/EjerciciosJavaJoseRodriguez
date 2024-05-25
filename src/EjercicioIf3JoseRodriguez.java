public class EjercicioIf3JoseRodriguez {
    private String nombre;

    public EjercicioIf3JoseRodriguez(String nombre) {
        this.nombre = nombre;
    }

    public int l(int num1, int num2, int num3) {
        int resultado = 1;
        if (num1 > num2 && num1 > num3) {resultado=0;}
        else if (num2 > num1 && num2 > num3) {resultado=1;}
        else {resultado =2;}
        return resultado;
    }
}