package datos_genericos;

public class Electronico extends Producto<String> {

   
    public Electronico(String nombre, double precio, String garantia) {
        super(nombre, precio, garantia);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónico: " + nombre + " | Precio: $" + precio + " | Garantía: " + extra);
    }
}