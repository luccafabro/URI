import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tempo, velocidademedia, consumomediodocarro;
        double litrosgastos, distancia;
        tempo = entrada.nextInt();
        velocidademedia = entrada.nextInt();
        consumomediodocarro = 12;
        distancia = velocidademedia * tempo;
        litrosgastos = distancia / consumomediodocarro;
        System.out.printf("%.3f\n", litrosgastos);
    }
}
