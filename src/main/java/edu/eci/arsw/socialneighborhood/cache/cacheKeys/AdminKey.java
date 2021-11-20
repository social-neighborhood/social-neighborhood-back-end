package edu.eci.arsw.socialneighborhood.cache.cacheKeys;


public class AdminKey{
    private int idUsuario;
    private int idConjunto;
    private int idConjuntoAdministrador;
    public AdminKey(int idConjunto, int idUsuario, int idConjuntoAdministrador){
        this.idUsuario=idUsuario;
        this.idConjunto=idConjunto;
        this.idConjuntoAdministrador=idConjuntoAdministrador;
    }

    @Override
    public String toString() {
        return "AdminKey{" +
                "idUsuario=" + idUsuario +
                ", idConjunto=" + idConjunto +
                ", idConjuntoAdministrador=" + idConjuntoAdministrador +
                '}';
    }
}
