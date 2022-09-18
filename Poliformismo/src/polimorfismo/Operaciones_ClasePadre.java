package polimorfismo;

import java.util.Scanner;

public abstract class Operaciones_ClasePadre {
    protected int valor1, valor2, resultado;
    protected Operaciones_ClasePadre padre;
		Scanner sc = new Scanner(System.in);

    public abstract int Operaciones(int valor1, int valor2);

    public void setResultado(int res) {
        this.resultado += res;
    };

    public int getResultado() {
			return resultado;
		}

    public void mostrarResultado() {
        System.out.println(resultado);
    }

}

