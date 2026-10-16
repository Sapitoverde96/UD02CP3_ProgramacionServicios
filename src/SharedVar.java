public class SharedVar {
    private int value;

    /**
     * Inicializa una instancia de la variable compartida con 0 por defecto.
     */
    public SharedVar() {
        this.value = 0;
    }

    /**
     * Devuelve el valor actual que tenga la variable compartida.
     * @return El valor de la variable compartida
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Establece el value de la variable compartida a un número cualquiera.
     * @param value el nuevo value para la variable compartida
     */
    public void setValue(int value) {
        this.value = value;
    }
}