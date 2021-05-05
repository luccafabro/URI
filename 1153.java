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
    private Fatorial fatorial;
    
    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        fatorial = new Fatorial();
    }
    
    public void sln(int s) {
        System.out.println(s);
    }
    
    public void executar() {
        fatorial.setValor(entrada.nextInt());
        sln(fatorial.getFatorial());
    }
}

class Fatorial {
    private int valor;
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int getFatorial() {
        int numeroQuandoEntrou = valor;
        int resultado = valor;
        
        for(int i = valor;i > 1;i--) {
            resultado = resultado * (i-1);
        }
        return resultado;
    }
}
