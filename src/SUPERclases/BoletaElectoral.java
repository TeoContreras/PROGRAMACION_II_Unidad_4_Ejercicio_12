package SUPERclases;

public abstract class BoletaElectoral {
    private String nombreCandidato;
    private String partidoPolitico;

    public BoletaElectoral(String nombreCandidato, String partidoPolitico){
        this.nombreCandidato = nombreCandidato;
        this.partidoPolitico = partidoPolitico;
    }

    public String getNombreCandidato() {
        return nombreCandidato;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public abstract int contarVoto(int cantidadEmitida);
}
