package simulation;

public class EstacionamentoStatus {
    private int numVeiculos;
    private EstacionamentoCaixa caixa;

    public EstacionamentoStatus(EstacionamentoCaixa caixa) {
        this.caixa = caixa;
        this.numVeiculos = 0;
    }

    public void veiculoEntra() {
        numVeiculos++; // REGIÃO CRÍTICA!
    }

    public void veiculoSai() {
        numVeiculos--; // REGIÃO CRÍTICA!
        this.caixa.pagamento();
    }

    public int getNumVeiculos() {
        return this.numVeiculos; // REGIÃO CRÍTICA!
    }

}
