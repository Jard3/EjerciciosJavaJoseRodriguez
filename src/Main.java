import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        EjerciciosIfJoseRodriguez EjerciciosIf=new EjerciciosIfJoseRodriguez("Ejercicio1");
System.out.println("Ingrese un número");
        int numero = scanner.nextInt();
        int resultado = EjerciciosIf.m(numero);
if(resultado==0){
System.out.println("El numero ingresado es cero");
}else if (resultado==-1){
    System.out.println("El numero ingresado es negativo");
}else {
    System.out.println("El numero ingresado es positivo");
}
    }
}