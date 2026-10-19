public class SharedVar {
    private int value;
    private boolean canSet;

    /**
     * Inicializa una instancia de la variable compartida con 0 por defecto.
     */
    public SharedVar() {
        this.value = 0;
        this.canSet = true;
    }

    /**
     * Devuelve el valor actual que tenga la variable compartida. Ahora está sincronizado desde la v2.0.
     * @return El valor de la variable compartida
     * @throws InterruptedException Lanza InterruptedException si el hilo se interrumpe mientras espera.
     * @version 2.0
     */
    public synchronized int getValue() throws InterruptedException {
        while (canSet) {
            wait();
        }
        canSet = true;
        notifyAll();
        return this.value;
    }

    /**
     * Establece el value de la variable compartida a un número cualquiera. Ahora está sincronizado desde la v2.0.
     * @param value el nuevo value para la variable compartida
     * @throws InterruptedException Lanza InterruptedException si el hilo se interrumpe mientras espera.
     * @version 2.0
     */
    public synchronized void setValue(int value) throws InterruptedException {
        while (!canSet) {
            wait();
        }
        this.value = value;
        canSet = false;
        notifyAll();
    }
}