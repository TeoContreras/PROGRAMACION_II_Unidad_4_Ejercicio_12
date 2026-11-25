package SUBclases;

import SUPERclases.BoletaElectoral;

public class BoletaConcejales extends BoletaElectoral {
    private int tachas;

    public BoletaConcejales(String nombreCandidato, String partidoPolitico, int tachas){
        super(nombreCandidato, partidoPolitico);
        this.tachas = tachas;
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        // Los votos tachados no son válidos
        int validos = cantidadEmitida - tachas;
        if (validos < 0) {
            validos = 0;
        }
        return validos;
    }
}
