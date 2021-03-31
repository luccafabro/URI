import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, volume, pi;
        pi = 3.14159;
        raio = entrada.nextDouble();
        volume = (4*pi*(Math.pow(raio, 3)/3));
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
