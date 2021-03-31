import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double salariofixo, montantedasvendas, salariofinal;
        nome = entrada.next();
        salariofixo = entrada.nextDouble();
        montantedasvendas = entrada.nextDouble();
        salariofinal = salariofixo+0.15 * montantedasvendas;
        System.out.printf("TOTAL = R$ %.2f\n", salariofinal);
    }
}
