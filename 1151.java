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
    private SequenciaFibonacci fibonacci;
    
    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        fibonacci = new SequenciaFibonacci();
    }
    
    public void sln(String s) {
        System.out.println(s);
    }
    
    public void executar() {
        fibonacci.setValor(entrada.nextInt());
        sln(fibonacci.retornarValoresAntesDoNumeroInformado());
    }
}

class SequenciaFibonacci {
    private int valor;
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public String retornarValoresAntesDoNumeroInformado() {
        String resposta = "";
        
        int numeroDepois;
        int numeroAntes = 0;
        int numeroAtual = 1;
        for (int i = 1; i <= valor; i++) {
            if (i == valor) // 
                    resposta += ""+numeroAntes;
                else
                resposta += (numeroAntes + " "); //
                numeroDepois = numeroAntes + numeroAtual; //
                numeroAntes = numeroAtual; //
                numeroAtual = numeroDepois;//
        }
        return resposta; //0
    }
}

