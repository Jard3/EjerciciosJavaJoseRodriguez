public class EjercicioWhile4JoseRodriguez {
    private String nombre;

    public EjercicioWhile4JoseRodriguez(String nombre) {
        this.nombre = nombre;
    }
    public int z(int num1, int num2) {
        int resultado = 0;
        while(num2>0){
            num1=num1+num2;
            num2=num2-1;
            resultado=num1;
            System.out.println(resultado);
        }
        return 0;
    }
}
