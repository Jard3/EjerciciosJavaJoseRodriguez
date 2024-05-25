public class EjerciciosIfJoseRodriguez {
    private String nombre;

public EjerciciosIfJoseRodriguez(String nombre) {
    this.nombre = nombre;
}

    public int m (int numero) {
    int resultado=1;
        if (numero == 0){resultado=0;
        }else if (numero <0){resultado=-1;}
        else {resultado=1;}

return resultado;
    }
}

