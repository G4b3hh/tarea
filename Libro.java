public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void imprimirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: $" + precio);
    }

    // Métodos get y set para cada atributo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

public class LibroDeTexto extends Libro {
    private String facultad;
    private int cursoAsociado;

    public LibroDeTexto(String titulo, String autor, double precio, String facultad, int cursoAsociado) {
        super(titulo, autor, precio);
        this.facultad = facultad;
        this.cursoAsociado = cursoAsociado;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Facultad: " + facultad);
        System.out.println("Curso Asociado: " + cursoAsociado);
    }
}

public class Novela extends Libro {
    private String tipo;

    public Novela(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Tipo de Novela: " + tipo);
    }
}
