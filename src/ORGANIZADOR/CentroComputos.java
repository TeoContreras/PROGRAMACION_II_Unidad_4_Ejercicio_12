package ORGANIZADOR;

import SUPERclases.BoletaElectoral;

import java.util.List;

public class CentroComputos {

    public int totalizarVotos(List<BoletaElectoral> boletas, int cantidadEmitida){
        int total = 0;
        for (BoletaElectoral b : boletas) {
            int validos = b.contarVoto(cantidadEmitida);
            System.out.println(b.getNombreCandidato() + " (" + b.getPartidoPolitico() + "): " + validos + " votos válidos");
            total = total + validos;
        }
        return total;
    }
}
