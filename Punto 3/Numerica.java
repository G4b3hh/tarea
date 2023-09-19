abstract class Numérica {
    public abstract String toString();
    public abstract boolean equals(Object ob);
    public abstract Numérica sumar(Numérica número);
    public abstract Numérica restar(Numérica número);
    public abstract Numérica multiplicar(Numérica número);
    public abstract Numérica dividir(Numérica número);
}

class Fracción extends Numérica {
    private int numerador;
    private int denominador;

    public Fracción(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar(); // Simplificamos la fracción al crearla
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Fracción fracción = (Fracción) ob;
        return numerador == fracción.numerador &&
                denominador == fracción.denominador;
    }

    @Override
    public Numérica sumar(Numérica número) {
        if (número instanceof Fracción) {
            Fracción otraFracción = (Fracción) número;
            int nuevoNumerador = numerador * otraFracción.denominador + otraFracción.numerador * denominador;
            int nuevoDenominador = denominador * otraFracción.denominador;
            return new Fracción(nuevoNumerador, nuevoDenominador);
        } else {
            throw new IllegalArgumentException("No se puede sumar una fracción con otro tipo de número.");
        }
    }

    @Override
    public Numérica restar(Numérica número) {
        if (número instanceof Fracción) {
            Fracción otraFracción = (Fracción) número;
            int nuevoNumerador = numerador * otraFracción.denominador - otraFracción.numerador * denominador;
            int nuevoDenominador = denominador * otraFracción.denominador;
            return new Fracción(nuevoNumerador, nuevoDenominador);
        } else {
            throw new IllegalArgumentException("No se puede restar una fracción con otro tipo de número.");
        }
    }

    @Override
    public Numérica multiplicar(Numérica número) {
        if (número instanceof Fracción) {
            Fracción otraFracción = (Fracción) número;
            int nuevoNumerador = numerador * otraFracción.numerador;
            int nuevoDenominador = denominador * otraFracción.denominador;
            return new Fracción(nuevoNumerador, nuevoDenominador);
        } else {
            throw new IllegalArgumentException("No se puede multiplicar una fracción con otro tipo de número.");
        }
    }

    @Override
    public Numérica dividir(Numérica número) {
        if (número instanceof Fracción) {
            Fracción otraFracción = (Fracción) número;
            if (otraFracción.numerador == 0) {
                throw new IllegalArgumentException("No se puede dividir por cero.");
            }
            int nuevoNumerador = numerador * otraFracción.denominador;
            int nuevoDenominador = denominador * otraFracción.numerador;
            return new Fracción(nuevoNumerador, nuevoDenominador);
        } else {
            throw new IllegalArgumentException("No se puede dividir una fracción por otro tipo de número.");
        }
    }

    private void simplificar() {
        int mcd = calcularMCD(Math.abs(numerador), Math.abs(denominador));
        numerador /= mcd;
        denominador /= mcd;
    }

    private int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
