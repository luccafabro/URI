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
    private Numero numero;
    
    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        numero = new Numero();
    }
    
    public void sln(String s) {
        System.out.print(s);
    }
    
    public void executar() {
        int quantidadeDeNumeros = entrada.nextInt();
        for(int i = 1; i <= quantidadeDeNumeros; i++) {
            numero.setValor(entrada.nextInt());
            numero.ePerfeitoOuNao();
        }
        sln(numero.getNumeroPerfeitoENaoPerfeitos());
    }
}

class Numero {
    private int valor;
    private String resposta = "";
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void ePerfeitoOuNao() {
        if (getSomaDosDivisores() == valor) {
            resposta += valor + " eh perfeito\n";
            return;
        }
        resposta +=  valor + " nao eh perfeito\n";
    }

    public int getSomaDosDivisores() {
        int soma = 0;
        for (int divisor = 1; divisor <= valor;divisor++) {
            if (valor% divisor == 0) { 
                soma += divisor;
            }
        }
        return soma - valor;
    }
    
    public String getNumeroPerfeitoENaoPerfeitos() {
        return resposta;
    }
}
