package E1.Logica;
// tipo dato generico <T>: cualquier tipo
public class Caja <T> {

    private T contenido;

    public void ponerAlgo(T contenido){
        this.contenido = contenido;
    }

    public T obtenerAlgo(){
        return contenido;
    }
}
