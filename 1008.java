import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int horas, numero;
        double valordahora;
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        horas = entrada.nextInt();
        valordahora = entrada.nextDouble();
        System.out.println("NUMBER = "+ numero);
        System.out.printf("SALARY = U$ %.2f\n", horas*valordahora);
    }
}
