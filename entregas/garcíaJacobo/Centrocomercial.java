public class CentroComercial {

    private Fila fila;
    private Tiempo tiempo;
    private Caja[] cajas;
    private Console console;
    private boolean haLlegadoCliente;
    private final double PROBABILIDAD_LLEGADA_CLIENTES = 0.6;
    private final double PROBABILIDAD_CAJA_LIBRE = 0.4;
    private final int NUMERO_CAJAS = 4;

    public CentroComercial() {
        fila = new Fila();
        cajas = new Caja[NUMERO_CAJAS];
        tiempo = new Tiempo();
        console = new Console();
        for (int i = 0; i <= NUMERO_CAJAS; i++) {
            cajas[i] = new Caja();
        }
    }

    public void ejecutar() {
        do {

            tiempo.avanzar();
            this.procesarLlegadaCliente();
            this.registrarEstado();
            this.asignarClienteACaja();
            this.atenderCliente();
            this.registrarEstado();
            this.pausar();

        } while (!tiempo.haFinalizado());
        this.mostrarResumen();
    }

    private void mostrarResumen() {
       
    }

    private void pausar() {

    }

    private void atenderCliente() {

    }

    private void asignarClienteACaja() {

    }

    private void registrarEstado() {

    }

    private void procesarLlegadaCliente() {

    }

}