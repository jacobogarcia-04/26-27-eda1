public class Cliente {
    private int minutoLlegada;

    public Cliente(int minutoLlegada) {
        this.minutoLlegada = minutoLlegada;
    }

    public int minutosEnCola(int minutoActual) {
        return minutoActual - minutoLlegada;
    }
}
