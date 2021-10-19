package edu.eci.arsw.socialneighborhood.services;

import edu.eci.arsw.socialneighborhood.persistence.impl.socialNeighborhoodImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("socialNeighborhoodServices")
public class socialNeighborhoodServices {
    @Autowired
    @Qualifier("socialNeighborhoodImpl")
    socialNeighborhoodImpl socialNeighborhood =null;

    public static Object getconjuntosByUser(String email) {
        return null;
    }
}
