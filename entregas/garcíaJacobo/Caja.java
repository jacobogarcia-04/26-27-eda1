public class Caja {
  private Cliente cliente;
  private boolean abierta;
  private Console console;
  private final double PROBABILIDAD_CAJA_ABIERTA = 0.4;

  public Caja() {
    abierta = false;

  }

  public boolean puedeAtender(Object primero) {
    return this.estaLibre() && abierta == true;
  }

  public boolean estaLibre() {
    return cliente == null;
  }

  public void añadirCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public void procesarAtencion() {

  }

  public boolean estaAbierta() {

  }

  public void abrir() {

  }

}
