package SUBclases;

import SUPERclases.BoletaElectoral;

public class BoletaLegisladores extends BoletaElectoral {
    private int preferencias;

    public BoletaLegisladores(String nombreCandidato, String partidoPolitico, int preferencias){
        super(nombreCandidato, partidoPolitico);
        this.preferencias = preferencias;
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        // Solo cuentan los votos que marcaron una preferencia
        if (preferencias < cantidadEmitida) {
            return preferencias;
        }
        return cantidadEmitida;
    }
}
