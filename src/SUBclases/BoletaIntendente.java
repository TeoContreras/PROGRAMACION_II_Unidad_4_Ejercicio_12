package SUBclases;

import SUPERclases.BoletaElectoral;

public class BoletaIntendente extends BoletaElectoral {
    public BoletaIntendente(String nombreCandidato, String partidoPolitico){
        super(nombreCandidato, partidoPolitico);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        // Boleta única: se cuentan todos los votos emitidos
        return cantidadEmitida;
    }
}
