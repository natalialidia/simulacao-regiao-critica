package sync;

public class EstacionamentoStatusSynchronized {
    private int numVeiculos;
    private EstacionamentoCaixaSynchronized caixa;

    public EstacionamentoStatusSynchronized(EstacionamentoCaixaSynchronized caixa) {
        this.caixa = caixa;
        this.numVeiculos = 0;
    }

    public void veiculoEntra() {
        synchronized(this) {
            numVeiculos++; // REGIÃO CRÍTICA!
        }
    }

    public void veiculoSai() {
        synchronized(this) {
            numVeiculos--; // REGIÃO CRÍTICA!
        }
        this.caixa.pagamento();
    }

    public synchronized int getNumVeiculos() {
        return this.numVeiculos; // REGIÃO CRÍTICA!
    }

}
