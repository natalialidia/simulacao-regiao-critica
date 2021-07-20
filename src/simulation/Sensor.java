package simulation;

public class Sensor implements Runnable {

    private EstacionamentoStatus status;

    public Sensor(EstacionamentoStatus status) {
        this.status = status;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            this.status.veiculoEntra();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.status.veiculoSai();

        }        
    }
    
}
