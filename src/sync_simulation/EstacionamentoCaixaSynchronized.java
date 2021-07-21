package sync_simulation;

public class EstacionamentoCaixaSynchronized {
    private static final int preco = 5;
    private int saldo;

    public synchronized void pagamento() {
        // REGIÃO CRÍTICA
        this.saldo += preco;
    }

    public void fechar() {
        // REGIÃO CRÍTICA
        int total;
        synchronized(this) {
            total = saldo;
            this.saldo = 0;
        }
        System.out.println("A quantia total em caixa é: "+ total);
    }

}
