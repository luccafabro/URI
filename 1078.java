//Tentando fazer orientado a objetos
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Tabuada tabuada;
    
    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        tabuada = new Tabuada();
    }
    
    public void sln(String s) {
        System.out.print(s);
    }
    
    public void executar() {
        tabuada.setMultiplicando(entrada.nextInt());
        sln(tabuada.multiplicador());
    }
}

class Tabuada {
    private int multiplicando;
    private String resultadoConcatenado = "";
    
    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }
    
    public String multiplicador() {
        for (int i = 1; i <= 10;i++) {
            int resultado = multiplicando*i;
            resultadoConcatenado += i +" x "+ multiplicando +" = "+resultado+"\n";
        }
        return resultadoConcatenado;
    }
}
