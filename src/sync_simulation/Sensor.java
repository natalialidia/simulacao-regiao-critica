package sync_simulation;

public class Sensor implements Runnable {

    private EstacionamentoStatusSynchronized status;

    public Sensor(EstacionamentoStatusSynchronized status) {
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
