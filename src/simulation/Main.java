package simulation;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n");

        EstacionamentoCaixa caixa = new EstacionamentoCaixa();
        EstacionamentoStatus status = new EstacionamentoStatus(caixa);

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
