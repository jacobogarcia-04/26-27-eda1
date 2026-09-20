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
            this.procesarAperturaCaja();
            this.atenderCliente();
            this.asignarClienteACaja();
            this.mostrarEstado();
            this.pausar();

        } while (!tiempo.haFinalizado());

        this.mostrarResumen();
    }

    private void procesarAperturaCaja() {
        if (Math.random() < PROBABILIDAD_CAJA_LIBRE) {
            for (int numeroCaja = 0; numeroCaja < cajas.length; numeroCaja++) {
                if (!cajas[numeroCaja].estaAbierta()) {
                    cajas[numeroCaja].abrir();
                }
            }
        }
    }

    private void mostrarEstado() {
        console.cleanScreen();
        tiempo.mostrar(haLlegadoCliente);
        fila.mostrar();
        this.mostrarCajas();

    }

    private void mostrarCajas() {
        for (int numeroCaja = 0; numeroCaja < cajas.length; numeroCaja++) {
            console.write("Caja[" + (numeroCaja + 1) + "]");
            cajas[numeroCaja].mostrar();
        }
    }

    private void mostrarResumen() {
        int numeroClientesAtendidos = 0;
        int personasEnFila = 0;
        for (int numeroCaja = 0; numeroCaja < cajas.length; numeroCaja++) {
            numeroClientesAtendidos = numeroClientesAtendidos + cajas[numeroCaja].clientesAtendidos();
        }
        personasEnFila = fila.obtenerNumero();
        console.writeln("Numero de clientes atendidos: " + numeroClientesAtendidos);
        console.writeln("Personas en fila: " + personasEnFila);

    }

    private void pausar() {
        console.pause(2);
    }

    private void atenderCliente() {
        for (int numeroCaja = 0; numeroCaja < cajas.length; numeroCaja++) {
            cajas[numeroCaja].procesarAtencion();
        }
    }

    private void asignarClienteACaja() {
        for (int numeroCaja = 0; numeroCaja < cajas.length; numeroCaja++) {
            if (cajas[numeroCaja].puedeAtender() && fila.hayGente()) {
                Cliente cliente = fila.sacar();
                cajas[numeroCaja].añadirCliente(cliente);
            }
        }
    }

    private void procesarLlegadaCliente() {
        haLlegadoCliente = Math.random() < PROBABILIDAD_LLEGADA_CLIENTES;
        if (haLlegadoCliente) {
            Cliente cliente = new Cliente(tiempo.obtenerMinuto());
            fila.añadirCliente(cliente);
        }
    }

}