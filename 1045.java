//Tentando Fazer Orientado a Objetos
//Apresentando Presentation Error
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}
class InterfaceTexto {
    private Scanner entrada;
    private AnalisarTiposDeTriangulos att;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        att = new AnalisarTiposDeTriangulos();
    }
    public void sln(String s) {
        System.out.println(s);
    }
    public void executar() {
        att.setA(entrada.nextDouble());
        att.setB(entrada.nextDouble());
        att.setC(entrada.nextDouble());
        sln(att.getTipoDoTriangulo1());
        sln(att.getTipoDoTriangulo2());
    }
}
class AnalisarTiposDeTriangulos {
    private double a, b, c;

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getOrdemDecrescenteA() {
        double aux, ladoA, ladoB, ladoC;
        ladoA = a;
        ladoB = b;
        ladoC = c;
        if (ladoA < ladoB) { // 5 e 7
            aux = ladoA; // aux = 5
            ladoA = ladoB; // ladoA = 7
            ladoB = aux; // ladoB = 5

        }
        if (ladoB < ladoC) {
            aux = ladoB;
            ladoB = ladoC;
            ladoC = aux;

            if (ladoA < ladoB) {
                aux = ladoA;
                ladoA = ladoB;
                ladoB = aux;
            }
        }
        return ladoA;
    }
    public double getOrdemDecrescenteB() {
        double aux, ladoA, ladoB, ladoC;
        ladoA = a;
        ladoB = b;
        ladoC = c;
        if (ladoA < ladoB) { // 5 e 7
            aux = ladoA; // aux = 5
            ladoA = ladoB; // ladoA = 7
            ladoB = aux; // ladoB = 5

        }
        if (ladoB < ladoC) {
            aux = ladoB;
            ladoB = ladoC;
            ladoC = aux;

            if (ladoA < ladoB) {
                aux = ladoA;
                ladoA = ladoB;
                ladoB = aux;
            }
        }
        return ladoB;
    }
    public double getOrdemDecrescenteC() {
        double aux, ladoA, ladoB, ladoC;
        ladoA = a;
        ladoB = b;
        ladoC = c;
        if (ladoA < ladoB) { // 5 e 7
            aux = ladoA; // aux = 5
            ladoA = ladoB; // ladoA = 7
            ladoB = aux; // ladoB = 5

        }
        if (ladoB < ladoC) {
            aux = ladoB;
            ladoB = ladoC;
            ladoC = aux;

            if (ladoA < ladoB) {
                aux = ladoA;
                ladoA = ladoB;
                ladoB = aux;
            }
        }
        return ladoC;
    }

    public String getTipoDoTriangulo1() {
        double ma, mb, mc;

        ma = getOrdemDecrescenteA();
        mb = getOrdemDecrescenteB();
        mc = getOrdemDecrescenteC();

        if (ma >= mb + mc)
            return "NAO FORMA TRIANGULO";

        if (ma*ma == mb*mb + mc*mc)
            return "TRIANGULO RETANGULO";

        if (ma*ma > mb*mb + mc*mc)
            return "TRIANGULO OBTUSANGULO";

        if (ma*ma < mb*mb + mc*mc)
            return "TRIANGULO ACUTANGULO";
        return "";
    }
    public String getTipoDoTriangulo2() {
        double ma, mb, mc;

        ma = getOrdemDecrescenteA();
        mb = getOrdemDecrescenteB();
        mc = getOrdemDecrescenteC();

        if (ma == mb && mb == mc)
            return "TRIANGULO EQUILATERO";

        if (ma == mb || mb == mc)
            return "TRIANGULO ISOSCELES";
        return "";
    }
}
