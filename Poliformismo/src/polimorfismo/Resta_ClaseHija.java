package polimorfismo;

public class Resta_ClaseHija extends Operaciones_ClasePadre {

    @Override
    public int Operaciones(int valor1, int valor2) {
        int resta = valor1 - valor2;
        setResultado(resultado + resta);
        return resta;
    }

}
