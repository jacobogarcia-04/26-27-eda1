package entregas.garciaJacobo;

public class ListaCandidatos {
    private Node primero;

    public ListaCandidatos() {
        primero = null;
    }

    public void insertarInicio(String value) {
        Node nuevo = new Node(value);
        nuevo.setNext(primero);
        primero = nuevo;

    }
}
