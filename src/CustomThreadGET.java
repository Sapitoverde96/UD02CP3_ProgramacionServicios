public class CustomThreadGET implements Runnable {
    private final SharedVar sharedVar;

    /**
     * Crea una instancia de <code>CustomThreadGET</code>. Que
     * se encarga de obtener el valor de la variable compartida.
     */
    public CustomThreadGET(SharedVar sharedVar) {
        this.sharedVar = sharedVar;
    }

    @Override
    public void run() {
        final int MIN = 0;
        final int MAX = 100;
        for (int iteration = MIN; iteration < MAX; iteration++) {
            System.out.printf("GET: %d\n", this.sharedVar.getValue());
        }
    }
}
