public class Libro {

    // Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;

    // Constructor sin parámetros
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.isbn = "000-0000000000";
        this.precio = 0.0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, String isbn, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }

    // Método para obtener los detalles del libro
    public String obtenerDetalles() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Precio: $" + precio;
    }

    // Método para actualizar el precio
    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
}
