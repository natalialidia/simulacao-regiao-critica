package simulation;

// REGIÃO CRÍTICA
public class EstacionamentoStatus {
    private int numVeiculos;
    private EstacionamentoCaixa caixa;

    public EstacionamentoStatus(EstacionamentoCaixa caixa) {
        this.caixa = caixa;
        this.numVeiculos = 0;
    }

    public void veiculoEntra() {
        numVeiculos++;
    }

    public void veiculoSai() {
        numVeiculos--;
        this.caixa.pagamento();
    }

    public int getNumVeiculos() {
        return this.numVeiculos;
    }

}
