package simulation;

// REGIÃO CRÍTICA
public class EstacionamentoStatusSynchronized {
    private int numVeiculos;
    private EstacionamentoCaixa caixa;

    public EstacionamentoStatusSynchronized(EstacionamentoCaixa caixa) {
        this.caixa = caixa;
        this.numVeiculos = 0;
    }

    public void veiculoEntra() {
        synchronized(this) {
            numVeiculos++;
        }
    }

    public void veiculoSai() {
        synchronized(this) {
            numVeiculos--;
        }
        this.caixa.pagamento();
    }

    public synchronized int getNumVeiculos() {
        return this.numVeiculos;
    }

}
