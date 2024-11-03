public class Planta {
    private String tipo;

    public Planta(String tipo) {
        this.tipo = tipo;
    }
}

class Main {
    public static void main(String[] args) {
        // Error de compilación: no se puede usar "super" aquí porque Main no es una clase derivada de Planta
        // super.tipo = "Orquídea";
    }
}
