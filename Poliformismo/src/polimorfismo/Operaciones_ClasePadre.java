package polimorfismo;

import java.util.Scanner;

public abstract class Operaciones_ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner sc = new Scanner(System.in);
    
    public void pedirDatos(){
        System.out.print("Dame el primer valor: ");
        valor1 = sc.nextInt();
        System.out.print("Dame el segundo valor: ");
        valor2 = sc.nextInt();
    }
    
    public abstract void Operaciones();
    
    public void mostrarResultado(){
        System.out.println(resultado);
    }
    
}
