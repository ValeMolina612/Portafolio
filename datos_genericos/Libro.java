package datos_genericos;

public class Libro extends Producto<Integer> {

    public Libro(String nombre, double precio, Integer paginas) {
        super(nombre, precio, paginas);
    }

    @Override
    public void mostrarDetalles() {
        String datos = "Nombre: " + nombre + 
                       "\nPrecio: $" + precio + 
                       "\nPáginas: " + extra;
        System.out.println(datos);
    }
}