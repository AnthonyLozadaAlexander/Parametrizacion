package E2;

public class Main {
    public static void main(String[] args) {
    ContainerPar<String, Integer> par = new ContainerPar<>();

    par.setK("Probando K");
    String contenidoK = par.getK();

        System.out.println("El Contenido K es: " + contenidoK);

    par.setV(67);
    Integer contenidoV = par.getV();

        System.out.println("El Contenido V es: " + contenidoV);
    }
}
