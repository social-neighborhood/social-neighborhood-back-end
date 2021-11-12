package edu.eci.arsw.socialneighborhood.cache.cacheKeys;

public class ClientKey {

    private int idUsuario;
    private int idConjunto;
    private int idUnidadDeVivienda;
    public ClientKey(int idConjunto, int idUsuario, int idUnidadDeVivienda){
        this.idUsuario=idUsuario;
        this.idConjunto=idConjunto;
        this.idUnidadDeVivienda=idUnidadDeVivienda;
    }

    @Override
    public String toString() {
        return "ClientKey{" +
                "idUsuario=" + idUsuario +
                ", idConjunto=" + idConjunto +
                ", idUnidadDeVivienda=" + idUnidadDeVivienda +
                '}';
    }
}
