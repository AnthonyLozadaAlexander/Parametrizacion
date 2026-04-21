package E1;

import E1.Logica.Caja;

public class Principal {
    public static void main(String[] args) {

        // creo una caja String
        Caja<String> cajaStr = new Caja<>();
        cajaStr.ponerAlgo("Probando Generic");
        String contenido = cajaStr.obtenerAlgo();

        System.out.println("El Contenido CajaStr es: " + contenido);

        // creo caja Enteros
        Caja<Integer> cajaInt = new Caja<>();
        cajaInt.ponerAlgo(67);
        Integer num = cajaInt.obtenerAlgo();

        System.out.println("El Contenido CajaInt es: " + num);
    }
}
