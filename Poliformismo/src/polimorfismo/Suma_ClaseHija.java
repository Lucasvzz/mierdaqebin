package polimorfismo;

public class Suma_ClaseHija extends Operaciones_ClasePadre {
    Suma_ClaseHija() {
        
    };

    @Override
    public int Operaciones(int valor1, int valor2) {
        int suma = valor1 + valor2;
        setResultado(resultado + suma);
        return suma;
    }
}