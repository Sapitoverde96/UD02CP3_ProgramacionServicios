public class CustomThreadSET implements Runnable {
    private final SharedVar sharedVar;

    /**
     * Crea una instancia de <code>CustomThreadSET</code>. Que
     * se encarga de incrementar el valor de la variable compartida.
     */
    public CustomThreadSET(SharedVar sharedVar) {
        this.sharedVar = sharedVar;
    }

    @Override
    public void run() {
        final int MIN = 0;
        final int MAX = 100;
        for (int iteration = MIN; iteration < MAX; iteration++) {
            this.sharedVar.setValue(iteration);
            System.out.printf("SET: %d\n", this.sharedVar.getValue());
        }
    }
}
