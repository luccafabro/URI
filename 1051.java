//Tentando fazer Orientado a Objetos
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}
class TemporizadorDoJogo {
    private int tempoinicial, tempofinal;

    public void setTempoInicial(int tempoinicial) {
        this.tempoinicial = tempoinicial;
    }
    public void setTempoFinal(int tempofinal) {
        this.tempofinal = tempofinal;
    }

    public int getTempoFinal() {
        if (tempofinal < tempoinicial)
            return 24 + tempofinal - tempoinicial;
        if (tempofinal > tempoinicial)
            return - (tempoinicial - tempofinal);
        if (tempoinicial == tempofinal)
            return 24;
        return 0;
    }
}
class InterfaceTexto {
    private Scanner entrada;
    private TemporizadorDoJogo temp;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        temp = new TemporizadorDoJogo();
    }

    public void sln(String s) {
        System.out.println(s);
    }
    public void sln() {
        System.out.println();
    }

    public void executar() {
        temp.setTempoInicial(entrada.nextInt());
        temp.setTempoFinal(entrada.nextInt());
        sln("O JOGO DUROU "+temp.getTempoFinal()+ " HORA(S)");
    }
}
