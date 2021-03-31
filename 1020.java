import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        numero = entrada.nextInt();
        System.out.println(numero/365+ " ano(s)");
        numero = numero - (numero/365)*365;
        System.out.println(numero/30+ " mes(es)");
        numero = numero - (numero/30)*30;
        System.out.println(numero+ " dia(s)");
    }
}
