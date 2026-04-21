package E3;

public class Main {
    public static void main(String[] args) {
       Caja<String> cajaStr = new Caja<>(new String[] { "A", "B", "C"});
       cajaStr.mostrarArr();

       String[] change = cajaStr.getData();
       change[0] = "Update"; // actualizo la informacion del arreglo de cajaStr

       cajaStr.mostrarArr();

       cajaStr.setData(new String[] {"X", "Y", "Z"}); // cambio total

        cajaStr.mostrarArr();
    }
}
