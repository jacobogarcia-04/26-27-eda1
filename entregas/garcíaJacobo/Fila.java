public class Fila {
    private Cliente[] clientes;
    private int numeroClientes;
    private int[] estados;
    private int numeroEstados;
    private Console console;

    public Fila() {
        console = new Console();
        estados = new int[240];
        numeroEstados = 0;
        clientes = new Cliente[1000];
    }

    public Cliente primero() {
        return clientes[0];
    }

    public boolean hayGente() {
        return numeroClientes > 0;
    }

    public Cliente sacar() {
        Cliente cliente = clientes[0];
        for (int i = 1; i < numeroClientes; i++) {
            clientes[i - 1] = clientes[i];

        }
        numeroClientes--;
        return cliente;
    }

    public void añadirCliente(Cliente cliente) {
        clientes[numeroClientes] = cliente;
        numeroClientes++;
    }

   public void mostrar() {
    console.writeln("FILA:");

    if (numeroClientes == 0) {
        console.writeln("  Vacia");
    } else {
        for (int i = 0; i < numeroClientes; i++) {
            console.writeln("  Cliente " + (i + 1));
        }
    }
}
    public void registrarEstado() {
        estados[numeroEstados] = numeroClientes;
        numeroEstados++;
    }

    public int obtenerNumero() {
        return numeroClientes;
    }

}
