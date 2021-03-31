import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int distanciapercorrida;
        double combustivelgasto, consumomedio;
        distanciapercorrida = entrada.nextInt();
        combustivelgasto = entrada.nextDouble();        
        consumomedio = distanciapercorrida / combustivelgasto;
        System.out.printf("%.3f km/l\n", consumomedio);
    }
}
