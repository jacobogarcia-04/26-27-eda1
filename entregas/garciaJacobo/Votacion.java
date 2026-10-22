package entregas.garciaJacobo;

public class Votacion {
    private String[] opciones;
    private Queue papeletas;
    private int[] recuento;
    private Console console;

    public Votacion(String[] opciones) {
        this.opciones = opciones;
        papeletas = new Queue();
        recuento = new int[opciones.length];
        console=new Console();
    }

    public void recogerPapeleta(String voto) {
        papeletas.insertarAlFinal(voto);
    }

    public String leerPapeleta() {
        assert !papeletas.estaVacia();

        return papeletas.sacarPrimero();
    }

    public void contarVoto(String voto) {
        boolean encontrado = false;

        if (voto.equals("")) {
            recuento[opciones.length - 2]++;
        } else {
            for (int i = 0; i < opciones.length - 2; i++) {
                if (voto.equals(opciones[i])) {
                    recuento[i]++;
                    encontrado = true;
                }
            }

            if (encontrado == false) {
                recuento[opciones.length - 1]++;
            }
        }
    }

    public boolean quedanPapeletas() {
        return !papeletas.estaVacia();
    }
    public void mostrarRecuento() {
    for (int i = 0; i < opciones.length; i++) {
        console.writeln(opciones[i] + " -->" + recuento[i]);
    }
}
}
