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
    private Narrador nrr;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        nrr = new Narrador();
    }
    public void sln(int s) {
        System.out.println(s);
    }
    public void sln(double s) {
        System.out.println(s);
    }
    public void executar() {
        nrr.setNumero(entrada.nextInt());
        nrr.setDistancia(entrada.nextInt());
        nrr.setVelocidade(entrada.nextInt());
        nrr.setNumero2(entrada.nextInt());
        nrr.setDistancia2(entrada.nextInt());
        nrr.setVelocidade2(entrada.nextInt());
        sln(nrr.getQuemGanhou());
    }
}
class Narrador {
    private int numero, distancia, velocidade;
    private int numero2, distancia2, velocidade2;

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void setDistancia2(int distancia2) {
        this.distancia2 = distancia2;
    }
    public void setVelocidade2(int velocidade2) {
        this.velocidade2 = velocidade2;
    }

    public double getTempo() {
        double vel, dis;
        vel = velocidade;
        dis = distancia;
        double tempo = dis / vel;
        return tempo;
    }
    public double getTempo2() {
        double dis2, vel2;
        vel2 = velocidade2;
        dis2 = distancia2;
        double tempo2 = dis2 / vel2;
        return tempo2;
    }

    public int getQuemGanhou() {
        if (getTempo() < getTempo2())
            return numero;
        else
            return numero2;
    }
}
