//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Libro usando el constructor sin parámetros
        Libro libro1 = new Libro();
        System.out.println("Detalles del libro 1: " + libro1.obtenerDetalles());

        // Crear una instancia de la clase Libro usando el constructor con parámetros
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", "123-4567890123", 15.99);
        System.out.println("Detalles del libro 2: " + libro2.obtenerDetalles());

        // Actualizar el precio del libro2
        libro2.actualizarPrecio(18.99);
        System.out.println("Detalles actualizados del libro 2: " + libro2.obtenerDetalles());
    }
}
