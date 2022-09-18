package forich;

import java.util.ArrayList;
import java.util.Scanner;

public class forichxd {
  public static void main(String[] args) {
    ArrayList<Usuario> misUsuarios = new ArrayList<Usuario>();
    int nroDeCuenta;
    Scanner sc = new Scanner(System.in);
    misUsuarios.add(new Usuario("Pedrito", 42155234, 1));
    misUsuarios.add(new Usuario("Pepito", 23235394, 2));
    misUsuarios.add(new Usuario("marsela", 44566331, 69));
    misUsuarios.add(new Usuario("marselo", 23465636, 420));
    do {
      System.out.print(
          "1. Ingresar usuario\n" +
              "2. Eliminar usuario\n" +
              "3. Modificar usuario\n" +
              "> ");
      int myInt = sc.nextInt();
      sc.nextLine();
      if (myInt == -1)
        break;
      else if (myInt == 1) {
        System.out.print("Ingrese el nombre: ");
        String name = sc.nextLine();
        System.out.print("Ingrese el Dni: ");
        int dni = sc.nextInt();
        System.out.print("Ingrese el numero de cuenta: ");
        nroDeCuenta = sc.nextInt();
        boolean esValido = true;
        for (Usuario papi : misUsuarios) {
          esValido = papi.nroDeCuenta != nroDeCuenta;
          if (!esValido) {
            System.out.println("El nro de cuenta es invalido");
            break;
          }
        }
        // for (int i = 0; i < misUsuarios.size() && esValido; i++) {
        // Usuario papi = misUsuarios.get(i);
        // esValido = papi.nroDeCuenta != nroDeCuenta;
        // if (!esValido) {
        // System.out.println("El nro de cuenta es invalido");
        // }
        // }
        if (esValido)
          misUsuarios.add(new Usuario(name, dni, nroDeCuenta));
      } else if (myInt == 2)
        System.out.println("2");
      else
        System.out.println("Esa opción no es válida");
    } while (true);
    sc.close();
  }
}
