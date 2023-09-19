
interface Motor {
    int calcularRevolucionesMotor(int fuerza, int radio);
}

interface Vela {
    void recomendarVelocidad(int velocidadViento);
}

abstract class Vehículo {
    protected int velocidadActual;
    protected int velocidadMáxima;

    public Vehículo(int velocidadMáxima) {
        this.velocidadActual = 0;
        this.velocidadMáxima = velocidadMáxima;
    }

    public abstract void acelerar(int incrementoVelocidad);

    public abstract void frenar(int decrementoVelocidad);

    public void imprimir() {
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("Velocidad Máxima: " + velocidadMáxima + " km/h");
    }
}

class VehículoTerrestre extends Vehículo implements Motor {
    private int cantidadLlantas;
    private String uso;

    public VehículoTerrestre(int velocidadMáxima, int cantidadLlantas, String uso) {
        super(velocidadMáxima);
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
    }

    @Override
    public void acelerar(int incrementoVelocidad) {
        velocidadActual += incrementoVelocidad;
        if (velocidadActual > velocidadMáxima) {
            velocidadActual = velocidadMáxima;
        }
    }

    @Override
    public void frenar(int decrementoVelocidad) {
        velocidadActual -= decrementoVelocidad;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}

class VehículoAcuático extends Vehículo implements Vela {
    private String tipo;
    private int capacidadPasajeros;

    public VehículoAcuático(int velocidadMáxima, String tipo, int capacidadPasajeros) {
        super(velocidadMáxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar(int incrementoVelocidad) {
        velocidadActual += incrementoVelocidad;
        if (velocidadActual > velocidadMáxima) {
            velocidadActual = velocidadMáxima;
        }
    }

    @Override
    public void frenar(int decrementoVelocidad) {
        velocidadActual -= decrementoVelocidad;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80 || velocidadViento < 10) {
            velocidadActual = 0;
        }
    }
}