package simulation;

// REGIÃO CRÍTICA
public class EstacionamentoCaixa {
    private static final int preco = 5;
    private int saldo;

    public void pagamento() {
        this.saldo += preco;
    }

    public void fechar() {
        System.out.println("A quantia total em caixa é: "+ saldo);
        this.saldo = 0;
    }

}
