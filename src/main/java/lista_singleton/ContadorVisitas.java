package lista_singleton;

public class ContadorVisitas {

    private int total = 0;

    private static ContadorVisitas instancia;

    private ContadorVisitas() {
    }

    public static ContadorVisitas getInstancia() {
        if (instancia == null) {
            instancia = new ContadorVisitas();
        }
        return instancia;
    }

    public void registrarVisita() {
        total++;
    }

    public int getTotal() {
        return total;
    }
}
