package sobrecarga;

public class Calculadora {
    public static int soma(int a, int b) {
        return a+b;
    }

    public static int soma(int a, int b, int c) {
        return a+b+c;
    }

    public static float soma(float a, float b) {
        return a+b;
    }

    public static Double fatorial(Double num) {
        // fat(3) = 3 * 2 * 1 = 6
        if (num == 1D) {
            return 1D;
        }
        return num * fatorial(num-1D);
    }


}
