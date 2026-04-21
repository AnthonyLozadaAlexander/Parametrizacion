package E3;

public class Caja<T> {

    private T[] data;

    public Caja(T[] data) {
        this.data = data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return this.data;
    }

    // Metodo De La Caja
    public void mostrarArr() {
        int count = 0;
        for (T item : this.data) {
            System.out.println("T[" + count + "]: ");
            System.out.println(item);
            count++;
        }
    }

}
