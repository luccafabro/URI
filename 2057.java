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
    private CalculadorDeFusoHorario cfs;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        cfs = new CalculadorDeFusoHorario();
    }
    private void sln(int s) {
        System.out.println(s);
    }
    private void sln() {
        System.out.println();
    }
    public void executar() {
        cfs.setFuso(entrada.nextInt());
        cfs.setTempo(entrada.nextInt());
        cfs.setViagem(entrada.nextInt());
        sln(cfs.getHoraPrevista());
    }
}
class CalculadorDeFusoHorario {
    private int tempo, viagem, fuso;

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    public void setViagem(int viagem) {
        this.viagem = viagem;
    }
    public void setFuso(int fuso) {
        this.fuso = fuso;
    }

    public int getHoraPrevista() {
        int soma = tempo + viagem + fuso;
        if (soma >= 23) {
            soma = soma - 24;
            return soma;
        } else {
            if (soma < 0) {
                soma = soma + 24;
                return soma;
            } else {
                return soma;
            }
        }
    }
}
