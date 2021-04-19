//Tentando fazer Orientado a Objetos
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}
class InterfaceTexto {
    private Scanner entrada;
    private AnaliseDeLua al;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        al = new AnaliseDeLua();
    }
    private void sln() {
        System.out.println();
    }
    private void sln(String s) {
        System.out.println(s);
    }
    public void executar() {
        al.setAntes(entrada.nextInt());
        al.setDepois(entrada.nextInt());
        sln(al.getEstadoDaLua());
    }
}
class AnaliseDeLua {
    private int antes, depois;

    public void setAntes(int antes) {
        this.antes = antes;
    }
    public void setDepois(int depois) {
        this.depois = depois;
    }

    public String getEstadoDaLua() {
        if (depois >= 0 && depois <= 2) {
            return "nova";
        } else {
            if (depois >=3 && depois <= 96 && depois > antes) {
                return "crescente";
            } else {
                if (depois >= 97 && antes <= 100) {
                    return "cheia";
                } else {
                        if (depois >=3 && depois <= 96 && antes > depois)
                            return "minguante";
                    }
                return "";
                }
            }
        }
    }
}
