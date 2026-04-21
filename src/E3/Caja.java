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

    public void imprimirArr(T[] data){
        for (int i = 0; i <= data.length-1; i++) {
            if(i == 0) System.out.print("[");
            System.out.print(data[i] + ", ");
            if(i == data.length - 1) System.out.println("]");
        }
    }
}
