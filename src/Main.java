import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
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
}*/
        /*
        EjercicioIf2JoseRodriguez Ejercicio2=new EjercicioIf2JoseRodriguez("Ejercicio2");
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        int resultado =Ejercicio2.n(numero);
        if (resultado == 1){System.out.println("El numero ingresado es impar ");}
        else{System.out.println("El numero ingresado es par ");}

         */
        EjercicioIf3JoseRodriguez Ejercicio3=new EjercicioIf3JoseRodriguez("Ejercicio3");
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();
        int resultado = Ejercicio3.l(num1, num2, num3);
        if (resultado == 0) {System.out.println("El numero más grande es: " + num1);}
        else if (resultado ==1) {System.out.println("El numero más grande es: " + num2);}
        else{System.out.println("El numero más grande es: " + num3);}
    }
}