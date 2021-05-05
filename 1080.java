//Tentando fazer orientando a objetos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Numero numero;
    
    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        numero = new Numero();
    }
    
    public void sln(String s) {
        System.out.println(s);
    }
    
    public void executar() {
        for (int i = 1; i <= 100; i++) {
            numero.setValor(entrada.nextInt(), i);
        }
        sln(numero.retornaMaiorNumeroEPosicao());
    }
}

class Numero {
    private int valor;
    private int maiorNumero = 0;
    private int posicaoMaiorNumero;
    
    public void setValor(int valor, int posicaoDoContador) {
        if (valor > maiorNumero) {
            maiorNumero = valor;
            posicaoMaiorNumero = posicaoDoContador;
        }
    }
    
    public String retornaMaiorNumeroEPosicao() {
        return maiorNumero+"\n"+posicaoMaiorNumero;
    }
}
