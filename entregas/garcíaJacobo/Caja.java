public class Caja {
  private Cliente cliente;
  private boolean abierta;
  private int clientesAtendidos;
  private Console console;

  public Caja() {
    abierta = false;

  }

  public boolean puedeAtender() {
    return this.estaLibre() && abierta == true;
  }

  public boolean estaLibre() {
    return cliente == null;
  }

  public void añadirCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public void procesarAtencion() {
    if (abierta && cliente != null) {
      clientesAtendidos++;
      cliente = null;
    }
  }

  public int clientesAtendidos() {
    return clientesAtendidos;
  }

  public boolean estaAbierta() {
    return abierta;
  }

  public void abrir() {
    abierta = true;
  }

  public  void mostrar() {
    if (abierta) {
        console.write("Caja abierta");
    } else {
        console.write("Caja cerrada");
    }

}
