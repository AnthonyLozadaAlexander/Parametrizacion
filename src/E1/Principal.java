package E1;

import E1.Logica.Caja;

public class Principal {
    public static void main(String[] args) {

        // creo una caja String
        Caja<String> cajaStr = new Caja<>();
        cajaStr.ponerAlgo("Probando Generic");
        String contenido = cajaStr.obtenerAlgo();
    }
}
