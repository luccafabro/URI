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
    private ContadorDeCobaias contador;
    
    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        contador = new ContadorDeCobaias();
    }
    
    public void sln(String s) {
        System.out.println(s);
    }
    
    public void slf(String s) {
        System.out.printf(s);
    }
    
    public void executar() {
        contador.setContadorDeTestes(entrada.nextInt());
        for (int i = 1; i <= contador.getNumerDeTestes();i++) {
            contador.setContadorDeCobaias(entrada.nextInt(), entrada.next());
        }
        sln("Total: "+contador.getNumeroTotalCobaias()+" cobaias");
        sln("Total de coelhos: "+ contador.getNumeroDeCoelhosCobaias());
        sln("Total de ratos: "+ contador.getNumeroDeRatosCobaias());
        sln("Total de sapos: "+ contador.getNumeroDeSaposCobaias());
        System.out.printf("Percentual de coelhos: %.2f %%\n",contador.getPercentualCoelhos());
        System.out.printf("Percentual de ratos: %.2f %%\n",contador.getPercentualRatos());
        System.out.printf("Percentual de sapos: %.2f %%\n",contador.getPercentualSapos());
    }
    
}

class ContadorDeCobaias {
    private int numeroTestes, numeroCoelhos = 0, numeroRatos = 0, numeroSapos = 0;
    
    public void setContadorDeTestes(int numeroTestes) {
        this.numeroTestes = numeroTestes;
    }
    
    public int getNumerDeTestes() {
        return numeroTestes;
    }
    
    public void setContadorDeCobaias(int valor, String animal) {
        switch (animal) {
            case "C":
                numeroCoelhos += valor;
                break;
            case "R":
                numeroRatos += valor;
                break;
            case "S":
                numeroSapos += valor;
                break;
        }
    }
    
    public int getNumeroTotalCobaias() {
        int totalCobaias = numeroCoelhos + numeroRatos + numeroSapos;
        return totalCobaias;
    }
    
    public int getNumeroDeRatosCobaias() {
        return numeroRatos;
    }
    
    public int getNumeroDeSaposCobaias() {
        return numeroSapos;
    }
    
    public int getNumeroDeCoelhosCobaias() {
        return numeroCoelhos;
    }
    
    public double getPercentualRatos() {
        return (double) numeroRatos * 100 / getNumeroTotalCobaias();
    }
    
    public double getPercentualSapos() {
        return (double) numeroSapos * 100 / getNumeroTotalCobaias();
    }
    
    public double getPercentualCoelhos() {
        return (double) numeroCoelhos * 100 / getNumeroTotalCobaias();
    }
}
