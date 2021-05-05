//Tentado fazer orientado a objetos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private Grenais grenal;
    
    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        grenal = new Grenais();
    }
    
    public void sln(String s) {
        System.out.println(s);
    }
    
    public void executar() {
        int i = 1;
        grenal.setOperacao(1);
        while (grenal.continuarOuNao() == true) {
            grenal.setQuantidaDeGolsEGrenais(entrada.nextInt(),entrada.nextInt(), i);
            grenal.quemGanhou();
            sln("Novo grenal (1-sim 2-nao)");
            grenal.setOperacao(entrada.nextInt());
            if (grenal.continuarOuNao() == false)
                break;
            /*
               3 grenais
                Inter:2
                Gremio:1
                Empates:0
                Inter venceu mais
               */
            i++;
        }
        sln(grenal.getNumeroGrenais()+" grenais");
        
        sln("Inter:"+grenal.getQuantidadeDeVitoriasInter());
        sln("Gremio:"+grenal.getQuantidadeDeVitoriasGremio());
        sln("Empates:"+grenal.getQuantidadeDeEmpates());
        
        sln(grenal.getQuemVenceuMais());
    }
}

class Grenais {
    private int valor, golsInter, golsGremio, empate, vitoriaInter = 0, vitoriaGremio = 0, empates, numeroGrenais = 0;
    // Inter Gremio
    
    public void setQuantidaDeGolsEGrenais(int golsInter, int golsGremio, int numeroGrenais) {
        this.golsInter = golsInter;
        this.golsGremio = golsGremio;
        this.numeroGrenais = numeroGrenais;
    }
    
    public int getNumeroGrenais() {
        return numeroGrenais;
    }
    
    public void setOperacao(int valor) {
        this.valor = valor;
    }
    
    public boolean continuarOuNao() {
        if (valor == 1) {
            return true;
        }
        return false;
    }
    
    public int getQuantidadeDeVitoriasInter() {
        return vitoriaInter;
    }
    
    public int getQuantidadeDeVitoriasGremio() {
        return vitoriaGremio;
    }
    
    public int getQuantidadeDeEmpates() {
        return empates;
    }
    
    public void quemGanhou() {
        if (golsInter > golsGremio) {
            vitoriaInter += 1;
            return;
        }
        if (golsGremio > golsInter) {
            vitoriaGremio += 1;
            return;
        }
        empates += 1;
    }
    
    public String getQuemVenceuMais() {
        if (vitoriaInter > vitoriaGremio)
            return "Inter venceu mais";
        if (vitoriaGremio > vitoriaInter)
            return "Gremio venceu mais";   
        return "Nao houve vencedor";
    }
}
