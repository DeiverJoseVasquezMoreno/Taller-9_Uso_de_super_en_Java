public class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
        // Error: no se puede acceder directamente a un atributo privado de la clase base
        // System.out.println(super.marca);
    }
}