package TiendaMascotas;

public class Mascota {
    private String nombre;
    private int edad;
    private String color;

    public Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Perro extends Mascota {
    private double peso;
    private boolean muerde;

    public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

        public static void sonido() {
        System.out.println("Los perros ladran");
    }
}

public class PerroPequeno extends Perro {
    public PerroPequeno(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
    }
}

public class PerroMediano extends Perro {
    public PerroMediano(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        // Configurar la raza del perro mediano
    }
}

public class PerroGrande extends Perro {
    public PerroGrande(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
    }
}

public class Gato extends Mascota {
    private double alturaSalto;
    private double longitudSalto;

    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }


    public double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public double getLongitudSalto() {
        return longitudSalto;
    }

    public void setLongitudSalto(double longitudSalto) {
        this.longitudSalto = longitudSalto;
    }

    public static void sonido() {
        System.out.println("Los gatos maúllan y ronronean");
    }
}

public class GatoSinPelo extends Gato {
    public GatoSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }
}

public class GatoPeloLargo extends Gato {
    public GatoPeloLargo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }
}

public class GatoPeloCorto extends Gato {
    public GatoPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }
}