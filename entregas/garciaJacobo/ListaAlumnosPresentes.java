package entregas.garciaJacobo;

public class ListaAlumnosPresentes {
    private Node primero;
    private Console console;

    public ListaAlumnosPresentes() {
        primero = null;
        console = new Console();
    }

    public void insertarInicio(String value) {
        Node nuevo = new Node(value);
        nuevo.setNext(primero);
        primero = nuevo;

    }

    public void mostrar() {
        Node actual = primero;
        while (actual != null) {
            actual.getValue();
            console.writeln(actual.getValue());
            actual = actual.getNext();

        }

    }
}
