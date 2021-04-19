//Tentando fazer Orientado a Objetos
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceTexto i = new InterfaceTexto();
        i.executar();
    }
}
class InterfaceTexto {
    private Scanner entrada;
    private OrdenadorSimples ordenar;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        ordenar = new OrdenadorSimples();
    }
    public void sln() {
        System.out.println();
    }
    public void sln(String s) {
        System.out.println(s);
    }
    public void executar() {
        ordenar.setNumero1(entrada.nextInt());
        ordenar.setNumero2(entrada.nextInt());
        ordenar.setNumero3(entrada.nextInt());
        sln(ordenar.getOrdemCrescente());
        sln(ordenar.getOrdemNatural());
    }
}
class OrdenadorSimples{
    private int numero1, numero2, numero3;

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
    public String getOrdemCrescente() {
        int aux1 = numero1, aux2 = numero2, aux3 = numero3, aux;
        if (aux1 > aux2) { //5 e 3
            aux = aux1; // aux = 5
            aux1 = aux2; // numero1 = 3
            aux2 = aux; // numero2 = 5
        }
        if (aux2 > aux3) {
            aux = aux2;
            aux2 = aux3;
            aux3 = aux;
            if (aux1 > aux2) {
                aux = aux1;
                aux1 = aux2;
                aux2 = aux;
            }
        }
        return aux1 +"\n"+ aux2 +"\n"+ aux3 + "\n";
    }
    public String getOrdemNatural() {
        return numero1 +"\n"+ numero2 +"\n"+ numero3;
    }
}
