package sync_simulation;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n");

        EstacionamentoCaixaSynchronized caixa = new EstacionamentoCaixaSynchronized();
        EstacionamentoStatusSynchronized status = new EstacionamentoStatusSynchronized(caixa);

        Thread Sensor1 = new Thread(new Sensor(status));
        Thread Sensor2 = new Thread(new Sensor(status));

        Sensor1.start();
        Sensor2.start();

        Sensor1.join();
        Sensor2.join();

        System.out.println("Número de veículos no estacionamento: "+status.getNumVeiculos());
        caixa.fechar();

    }
}
