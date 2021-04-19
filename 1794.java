//Tentando Fazer Orientado a Objetos
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}
class InterfaceTexto {
    private Scanner entrada;
    private ConsegueLavareSecar lav;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        lav = new ConsegueLavareSecar();
    }
    public void sln(String s) {
        System.out.println(s);
    }
    public void executar() {
        lav.setNumero(entrada.nextInt());
        lav.setLavadeira(entrada.nextInt(), entrada.nextInt());
        lav.setSecadoura(entrada.nextInt(), entrada.nextInt());
        sln(lav.ePossivelLavareSecar());
    }
}
class ConsegueLavareSecar {
    private int minL, maxL, minS, maxS, numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setLavadeira(int minL, int maxL) {
        this.minL = minL;
        this.maxL = maxL;
    }
    public void setSecadoura(int minS, int maxS) {
        this.minS = minS;
        this.maxS = maxS;
    }
    public String ePossivelLavareSecar() {
        if (numero >= minS && numero >= minL && numero <= maxL && numero <= maxS) {
            return "possivel";
        } else {
            return "impossivel";
        }
    }
}
