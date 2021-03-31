import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, horas, minutos, segundos;
        numero = entrada.nextInt();
        horas = numero/3600;
        numero = numero - (numero/3600)*3600;
        minutos = numero/60;
        numero = numero - (numero/60)*60;
        segundos = numero;
        System.out.println(horas+":"+minutos+":"+segundos);
    }
}
