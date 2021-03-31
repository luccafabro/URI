import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int distancia, tempo;
        distancia = entrada.nextInt();
        tempo = distancia*60 / 30; // 1hora(60minutos) -> 30km e X minutos -> distnacia (Regra de 3)
        System.out.println(tempo +" minutos");
    }
}
