package edu.eci.arsw.socialneighborhood.cache;

import edu.eci.arsw.socialneighborhood.cache.cacheItem.CacheItemAdmin;
import edu.eci.arsw.socialneighborhood.cache.cacheItem.CacheItemClient;
import edu.eci.arsw.socialneighborhood.cache.cacheKeys.AdminKey;
import edu.eci.arsw.socialneighborhood.cache.cacheKeys.ClientKey;
import edu.eci.arsw.socialneighborhood.services.AdminServices;
import edu.eci.arsw.socialneighborhood.services.ClientServices;
import edu.eci.arsw.socialneighborhood.services.CommonServices;
import net.jodah.expiringmap.ExpiringMap;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;


@Service("cache")
public class Cache {

    private Map<String,CacheItemAdmin> CacheAdmin = ExpiringMap.builder().expiration(10, TimeUnit.MINUTES).build();
    private ConcurrentMap<String,CacheItemAdmin> concurrentCacheAdmin = (ConcurrentMap<String, CacheItemAdmin>) CacheAdmin;

    private  Map<String, CacheItemClient> CacheClient = ExpiringMap.builder().expiration(10, TimeUnit.MINUTES).build();
    private  ConcurrentMap<String,CacheItemClient> concurrentCacheClient = (ConcurrentMap<String, CacheItemClient>) CacheClient;


    public Cache(){}

    public void loginAdmin(int idConjunto, int idUsuario, int idConjuntoAdministrador, CommonServices commonServices, AdminServices adminServices) throws ParseException {
        String key = new AdminKey(idConjunto, idUsuario, idConjuntoAdministrador).toString();
        CacheItemAdmin value = new CacheItemAdmin(idConjunto, idUsuario, idConjuntoAdministrador, commonServices, adminServices);
        concurrentCacheAdmin.put(key, value);
    }

    public CacheItemAdmin getAdmin(int idConjunto, int idUsuario, int idConjuntoAdministrador, CommonServices commonServices, AdminServices adminServices) throws ParseException {
        String key = new AdminKey(idConjunto, idUsuario, idConjuntoAdministrador).toString();
        CacheItemAdmin value = concurrentCacheAdmin.get(key);
        if (value == null) {
            value = new CacheItemAdmin(idConjunto, idUsuario, idConjuntoAdministrador, commonServices, adminServices);
            concurrentCacheAdmin.put(key, value);
        }
        return value;
    }

    public void loginClient(int idConjunto, int idUsuario, int idUnidadDeVivienda, CommonServices commonServices, ClientServices clientServices) throws ParseException{
        String key = new ClientKey(idConjunto, idUsuario, idUnidadDeVivienda).toString();
        CacheItemClient value = new CacheItemClient(idConjunto, idUsuario, idUnidadDeVivienda, commonServices, clientServices);
        concurrentCacheClient.put(key, value);
    }

    public CacheItemClient getClient(int idConjunto, int idUsuario, int idUnidadDeVivienda, CommonServices commonServices, ClientServices clientServices){
        String key = new ClientKey(idConjunto, idUsuario, idUnidadDeVivienda).toString();
        CacheItemClient value = concurrentCacheClient.get(key);
        if (value==null){
            value = new CacheItemClient(idConjunto, idUsuario, idUnidadDeVivienda, commonServices, clientServices);
            concurrentCacheClient.put(key, value);
        }
        return value;
    }
}
