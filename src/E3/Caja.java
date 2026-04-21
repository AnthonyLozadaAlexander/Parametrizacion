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

    public void mostrarArr(T[] arr) {
        int count = 0;
        for (T item : arr) {
            System.out.println("T[" + count + "]: ");
            System.out.println(item);
            count++;
        }
    }

}
