
public class Main {
    public static void main(String[] args) {
        Fracción fracción1 = new Fracción(1, 2);
        Fracción fracción2 = new Fracción(3, 4);

        System.out.println("Fracción 1: " + fracción1.toString());
        System.out.println("Fracción 2: " + fracción2.toString());

        Numérica suma = fracción1.sumar(fracción2);
        System.out.println("Suma: " + suma.toString());

        Numérica resta = fracción1.restar(fracción2);
        System.out.println("Resta: " + resta.toString());

        Numérica multiplicacion = fracción1.multiplicar(fracción2);
        System.out.println("Multiplicación: " + multiplicacion.toString());

        Numérica division = fracción1.dividir(fracción2);
        System.out.println("División: " + division.toString());
    }
}
