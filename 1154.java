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
    
    public void executar() {
        int i = 0;
        
        while (numero.getValor() >= 0) {
            numero.setValor(entrada.nextInt());
            numero.geraSomaDosValores();
            numero.setQuantidaDeNumeros(i);
            i++;
        }
        System.out.printf("%.2f\n",numero.getMedia());
    }
}

class Numero {
    private int valor, quantidade, soma = 0;
    private String resposta = "";
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }
    
    public void geraSomaDosValores() {
        soma += valor;
    }
    
    public int getSoma() {
        return soma - getValor();
    }
    
    public void setQuantidaDeNumeros(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public double getMedia() {
        return (double) getSoma() / getQuantidade();
    }
}
