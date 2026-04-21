package E3;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Carlos"};
       Caja<String> cajaStr = new Caja<>(nombres);

       cajaStr.mostrarArr(cajaStr.getData());
    }
}
