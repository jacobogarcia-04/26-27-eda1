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

    }

    private void pausar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }

    private void atenderCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atenderCliente'");
    }

    private void asignarClienteACaja() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asignarClienteACaja'");
    }

    private void registrarEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarEstado'");
    }

    private void procesarLlegadaCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'procesarLlegadaCliente'");
    }

}