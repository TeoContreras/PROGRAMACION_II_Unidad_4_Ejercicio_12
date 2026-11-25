import ORGANIZADOR.CentroComputos;
import SUBclases.BoletaConcejales;
import SUBclases.BoletaIntendente;
import SUBclases.BoletaLegisladores;
import SUPERclases.BoletaElectoral;

import java.util.ArrayList;
import java.util.List;

public class MAIN {
    public static void main(String[] args) {
        List<BoletaElectoral> boletas = new ArrayList<>();
        boletas.add(new BoletaIntendente("Laura Diaz", "Frente Unido"));
        boletas.add(new BoletaConcejales("Marcos Ruiz", "Partido Verde", 80));
        boletas.add(new BoletaLegisladores("Elena Torres", "Alianza Federal", 700));

        CentroComputos centro = new CentroComputos();

        int cantidadEmitida = 1000;
        System.out.println("--- Reporte electoral (" + cantidadEmitida + " votos emitidos por categoría) ---");
        int total = centro.totalizarVotos(boletas, cantidadEmitida);
        System.out.println("--------------------------------");
        System.out.println("Total de sufragios válidos: " + total);
    }
}
