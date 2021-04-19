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
    private CalculadoraDeLanche lanche;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        lanche = new CalculadoraDeLanche();
    }

    public void executar() {
        lanche.setCodigo(entrada.nextInt());
        lanche.setQuantidade(entrada.nextInt());
        sln(lanche.getTotalFormatado());
    }
    public void sln() {
        System.out.println();
    }
    public void sln(String s) {
        System.out.println(s);
    }
}
class CalculadoraDeLanche {
    private int codigo, quantidade;
    private double total, produto;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getPrecoProduto() {
        if (codigo == 1) {
            return 4;
        } else {
            if (codigo == 2) {
                return 4.5;
            } else {
                if (codigo == 3) {
                    return 5;
                } else {
                    if (codigo == 4) {
                        return 2;
                    } else {
                        if (codigo == 5) {
                            return 1.5;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getTotalFormatado() {
        total = getPrecoProduto() * quantidade;
        return String.format("Total: R$ %.2f", total);
    }
}
