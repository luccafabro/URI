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
    private Divisores divisores;
    
    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        divisores = new Divisores();
    }
    
    public void sln(String s) {
        System.out.print(s);
    }
    
    public void executar() {
        divisores.setDividendo(entrada.nextInt());
        sln(divisores.getTodosOsDivisores());
    }
}

class Divisores {
    private int dividendo;
    
    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }
    
    public String getTodosOsDivisores() {
        String resposta = "";
        for (int divisor = 1; divisor <= dividendo;divisor++) {
            if (dividendo % divisor == 0) {
                resposta += divisor+"\n";
            }
        }
        return resposta;
    }
}
