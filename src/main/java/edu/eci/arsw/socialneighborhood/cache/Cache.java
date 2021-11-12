package edu.eci.arsw.socialneighborhood.cache;

import edu.eci.arsw.socialneighborhood.cache.cacheItem.CacheItemAdmin;
import edu.eci.arsw.socialneighborhood.cache.cacheItem.CacheItemClient;
import edu.eci.arsw.socialneighborhood.cache.cacheKeys.AdminKey;
import edu.eci.arsw.socialneighborhood.cache.cacheKeys.ClientKey;
import edu.eci.arsw.socialneighborhood.services.AdminServices;
import edu.eci.arsw.socialneighborhood.services.ClientServices;
import edu.eci.arsw.socialneighborhood.services.CommonServices;
import net.jodah.expiringmap.ExpiringMap;
import net.jodah.expiringmap.ExpiringValue;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
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
        concurrentCacheAdmin.put(new AdminKey(idConjunto,idUsuario, idConjuntoAdministrador).toString(),
                new CacheItemAdmin(idConjunto,idUsuario,idConjuntoAdministrador,commonServices,adminServices));
    }

    public CacheItemAdmin getAdmin(int idConjunto, int idUsuario, int idConjuntoAdministrado){
        System.out.println(concurrentCacheAdmin.size());
        for (String key : concurrentCacheAdmin.keySet()) {
            System.out.println(key + " = " + concurrentCacheAdmin.get(key).toString());
        }
        return concurrentCacheAdmin.get(new AdminKey(idConjunto,idUsuario,idConjuntoAdministrado).toString());
    }

    public void loginClient(int idConjunto, int idUsuario, int idUnidadDeVivienda, CommonServices commonServices, ClientServices clientServices) throws ParseException{
        System.out.println(concurrentCacheClient);
        concurrentCacheClient.put(new ClientKey(idConjunto,idUsuario, idUnidadDeVivienda).toString(),
                new CacheItemClient(idConjunto,idUsuario,idUnidadDeVivienda,commonServices,clientServices));
    }

    public CacheItemClient getClient(int idConjunto, int idUsuario, int idUnidadDeVivienda){
        return concurrentCacheClient.get(new AdminKey(idConjunto,idUsuario,idUnidadDeVivienda).toString());
    }
}
