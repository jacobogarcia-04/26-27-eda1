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
        for (int i = 0; i < NUMERO_CAJAS; i++) {
            cajas[i] = new Caja();
        }
    }

    public void ejecutar() {
        do {

            tiempo.avanzar();
            this.procesarLlegadaCliente();
            fila.registrarEstado();
            this.asignarClienteACaja();
            this.atenderCliente();
            this.motrarEstado();
            this.pausar();

        } while (!tiempo.haFinalizado());
        this.mostrarResumen();
    }

    private void motrarEstado() {
        console.cleanScreen();
        tiempo.mostrar(haLlegadoCliente);
        fila.mostrar();
        this.mostrarCajas();
    }

    private void mostrarCajas() {
        
    }

    private void mostrarResumen() {

    }

    private void pausar() {

    }

    private void atenderCliente() {
        for (int numeroCaja = 0; numeroCaja < cajas.length; numeroCaja++) {
            cajas[numeroCaja].procesarAtencion();
        }
    }

    private void asignarClienteACaja() {
        for (int numeroCaja = 0; numeroCaja < cajas.length; numeroCaja++) {
            if (cajas[numeroCaja].estaLibre() && fila.hayGente()
                    && cajas[numeroCaja].puedeAtender(fila.primero())) {
                Cliente cliente = fila.sacar();
                cajas[numeroCaja].añadirCliente(cliente);
            }

        }
    }

    private void procesarLlegadaCliente() {
        haLlegadoCliente = Math.random() < PROBABILIDAD_LLEGADA_CLIENTES;
        if (haLlegadoCliente) {
            Cliente cliente = new Cliente();
            fila.añadirCliente(cliente);
        }
    }

}