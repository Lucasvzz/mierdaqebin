package polimorfismo;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1, v2, opc;
        Operaciones_ClasePadre resta = new Resta_ClaseHija();
        System.out.println(resta.resultado);
        Operaciones_ClasePadre suma = new Suma_ClaseHija();
        do {
            System.out.println("Opcion 1: Sumar");
            System.out.println("Opcion 2: Restar");
            System.out.println("Opcion 3: Mostrar resultados acumulados");
            System.out.println("Opcion 0: Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("valor 1: ");
                    v1 = sc.nextInt();
                    System.out.print("valor 2: ");
                    v2 = sc.nextInt();
                    System.out.println("El resultado de la suma es: " + suma.Operaciones(v1, v2));
                    break;
                case 2:
                    System.out.print("valor 1: ");
                    v1 = sc.nextInt();
                    System.out.print("valor 2: ");
                    v2 = sc.nextInt();
                    System.out.println("El resultado de la resta es: " + resta.Operaciones(v1, v2));
                    break;
                case 3:
                    System.out.println("El resultado acumulativo es: " + (suma.resultado + resta.resultado));
                    break;
                default:
                    break;
            }
        } while (opc != 0);
        sc.close();
    }
}
