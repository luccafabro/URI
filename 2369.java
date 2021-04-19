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
    private CalculadorDeContaAgua cca;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        cca = new CalculadorDeContaAgua();
    }
    private void sln(int s) {
        System.out.println(s);
    }
    public void executar() {
        cca.setMetroscubicos(entrada.nextInt());
        sln(cca.getPrecoDaConta());
    }
}
class CalculadorDeContaAgua {
    private int metroscubicos, valordacaonta;
    private int assinaturabasica = 7;

    public void setMetroscubicos(int metroscubicos) {
        this.metroscubicos = metroscubicos;
    }
    public int getPrecoDaConta() {
        if (metroscubicos >= 11 && metroscubicos <= 30) {
            valordacaonta = assinaturabasica + (metroscubicos-10)*1;
            return valordacaonta;
        } else {
            if (metroscubicos >= 31 && metroscubicos <= 100) {
                valordacaonta = 27 + (metroscubicos-30) * 2;
                return valordacaonta;
            } else {
                if (metroscubicos >= 101) {
                    valordacaonta = 167 + (metroscubicos-100) * 5;
                    return valordacaonta;
                } else {
                    valordacaonta = assinaturabasica;
                    return valordacaonta;
                }
            }
        }
    }
}
