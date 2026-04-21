package E3;

public class Caja <T>{

    private T[] data;

    public Caja(T[] data){
        this.data = data;
    }

    public void setData(T[] data){
        this.data = data;
    }

    public T[] getData(){
        return this.data;
    }
}
