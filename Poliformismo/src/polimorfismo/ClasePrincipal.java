package polimorfismo;


public class ClasePrincipal {
    public static void main(String[] args){
        
        Operaciones_ClasePadre mensajero_Suma = new Suma_ClaseHija();
        mensajero_Suma.pedirDatos();
        mensajero_Suma.Operaciones();
        mensajero_Suma.mostrarResultado();
        
        Operaciones_ClasePadre mensajero_Resta = new Resta_ClaseHija();
        mensajero_Resta.pedirDatos();
        mensajero_Resta.Operaciones();
        mensajero_Resta.mostrarResultado();
    }
}
