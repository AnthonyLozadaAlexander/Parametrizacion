package E2;

public class ContainerPar <K, V>{
    private K contenidoK;
    private V contenidoV;

    public void setK(K contenidoK){
        this.contenidoK = contenidoK;
    }

    public void setV(V contenidoV){
        this.contenidoV = contenidoV;
    }

    public K getK(){
        return contenidoK;
    }

    public V getV(){
        return contenidoV;
    }
}
