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

         */ /*
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
        */
/*
        EjercicioIf4JoseRodriguez Ejercicio4=new EjercicioIf4JoseRodriguez("Ejercicio4");
        System.out.println("Ingrese un año");
        int año = scanner.nextInt();
        int resultado = Ejercicio4.a(año);
        if (resultado == 0){System.out.println("El año ingresado es bisiesto");}
        else{System.out.println("El año ingresado no es bisiesto");}*/
        /*
        EjercicioWhileJoseRodriguez Ejercicio5=new EjercicioWhileJoseRodriguez("Ejercicio5");
        int resultado=Ejercicio5.i(0);
        while(resultado<20){
            resultado+=1;
            System.out.println(resultado);
        }*/
        /*
        EjercicioWhile2JoseRodriguez Ejercicio6=new EjercicioWhile2JoseRodriguez("Ejercicio6");
        System.out.println("Ingrese un número");
        int numMax = scanner.nextInt();
        int resultado = Ejercicio6.c(0,numMax);
        while(resultado<numMax){
            resultado+=1;
            System.out.println(resultado);
        }*/ /*
EjercicioWhile3JoseRodriguez Ejercicio7=new EjercicioWhile3JoseRodriguez("Ejercicio7");
System.out.println("Ingrese un numero");
int num2 = scanner.nextInt();

        int num1=0;
while(num2>=0){
    System.out.println("Ingrese un numero");
    num2 = scanner.nextInt();
    int resultado = Ejercicio7.a(0,num2);
resultado=num1+num2;
    System.out.println("La suma de los numeros es: " + resultado);
}*/
        EjercicioWhile4JoseRodriguez Ejercicio8=new EjercicioWhile4JoseRodriguez("Ejercicio4");
        System.out.println("Ingrese un numero");
        int num2 = scanner.nextInt();
        int resultado = Ejercicio8.z(0,num2);
        while (num2>0){;
            num2-=1;
        }
    }
}