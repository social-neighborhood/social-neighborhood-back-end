package edu.eci.arsw.socialneighborhood.persistence.impl;

import ch.qos.logback.core.joran.conditional.IfAction;
import edu.eci.arsw.socialneighborhood.model.*;
import edu.eci.arsw.socialneighborhood.persistence.SocialNeighborhood;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import edu.eci.arsw.socialneighborhood.repository.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("socialNeighborhoodImpl")
public class SocialNeighborhoodImpl implements SocialNeighborhood {

    @Autowired
    @Qualifier("tipoInmuebleRepository")
    TipoInmuebleRepository tipoInmuebleRepository;

    @Autowired
    @Qualifier("tipoAgrupacionRepository")
    TipoAgrupacionRepository tipoAgrupacionRepository;

    @Autowired
    @Qualifier("tipoAgrupacionConjuntoRepository")
    TipoAgrupacionConjuntoRepository tipoAgrupacionConjuntoRepository;

    @Autowired
    @Qualifier("tipoInmuebleConjuntoRepository")
    TipoInmuebleConjuntoRepository tipoInmuebleConjuntoRepository;

    @Autowired
    @Qualifier("unidadDeViviendaRepository")
    UnidadDeViviendaRepository unidadDeViviendaRepository;

    @Autowired
    @Qualifier("usuarioRepository")
    UsuarioRepository usuarioRepository;

    @Autowired
    @Qualifier("zonaComunConjuntoRepository")
    ZonaComunConjuntoRepository zonaComunConjuntoRepository;

    @Autowired
    @Qualifier("agrupacionRepository")
    AgrupacionRepository agrupacionRepository;

    @Autowired
    @Qualifier("unidadDeViviendaUsuarioRepository")
    UnidadDeViviendaUsuarioRepository unidadDeViviendaUsuarioRepository;

    @Autowired
    @Qualifier("conjuntoUsuarioRepository")
    ConjuntoUsuarioRepository conjuntoUsuarioRepository ;

    @Autowired
    @Qualifier("conjuntoRepository")
    ConjuntoRepository conjuntoRepository ;

    @Autowired
    @Qualifier("zonaComunRepository")
    ZonaComunRepository zonaComunRepository;

    @Autowired
    @Qualifier("conjuntoAdministradorRepository")
    ConjuntoAdministradorRepository conjuntoAdministradorRepository;

    @Autowired
    @Qualifier("alquilerRepository")
    AlquilerRepository alquilerRepository;

    private SimpleDateFormat simpleDateFormat =new SimpleDateFormat("H:mm");

    private SimpleDateFormat simpleDateFormatH =new SimpleDateFormat("yyy-MM-dd H:mm");

    private DateTimeFormatter lformat = DateTimeFormatter.ofPattern("yyy-MM-dd");

    private DateTimeFormatter hformat = DateTimeFormatter.ofPattern("yyy-MM-dd H:mm");

    @Override
    public List<TipoAgrupacion> getTipoAgrupacion() {
        return tipoAgrupacionRepository.findAll();
    }

    @Override
    public List<TipoInmueble> getTipoInmueble() {
        return  tipoInmuebleRepository.findAll();
    }

    @Override
    public List<TipoAgrupacionConjunto> getTipoAgrupacionPropia() {
        return tipoAgrupacionConjuntoRepository.findAll();
    }

    @Override
    public List<TipoInmuebleConjunto> getTipoInmueblesPropia() {
        return tipoInmuebleConjuntoRepository.findAll();
    }

    @Override
    public List<UnidadDeVivienda> getUnidadDeVivinenda() {
        return unidadDeViviendaRepository.findAll();
    }


    @Override
    public ConjuntoAdministrador getConjuntosByEmaill(String email) {
        Usuario admin = usuarioRepository.findByEmail(email);
        return conjuntoAdministradorRepository.findByIdAdmin(admin.getId());
    }

    @Override
    public List<Conjunto> getConjuntos() {
        return conjuntoRepository.findAll();
    }

    @Override
    public List<Usuario> getConjuntoUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<Agrupacion> getAgrupacion() {
        return agrupacionRepository.findAll();
    }

    @Override
    public JSONArray getUnidadDeVivinendaByEmail(String email) {
        UnidadDeVivienda unidadDeVivienda = new UnidadDeVivienda();
        List<UnidadDeViviendaUsuario> unidadDeViviendaUsuario = new ArrayList<>();
        Usuario usuario = usuarioRepository.findByEmail(email);
        List<ConjuntoUsuario> conjuntoUsuario = conjuntoUsuarioRepository.findByIdUsuario(usuario.getId());
        JSONArray json = new JSONArray();
        JSONObject jsonObject;
        String numagrupacion= null;
        String nombreagrupacion=null;
        for (ConjuntoUsuario conjuntoUsuario1: conjuntoUsuario) {
            unidadDeViviendaUsuario= unidadDeViviendaUsuarioRepository.findByIdConjuntoUsuario(conjuntoUsuario1.getId());
            for (UnidadDeViviendaUsuario unidadDeViviendaUsuario1 : unidadDeViviendaUsuario) {
                unidadDeVivienda = unidadDeViviendaRepository.findByIDUnidadDeViviendaUsuario(unidadDeViviendaUsuario1.getIdUnidadDeVivienda());
                if (unidadDeVivienda.getIdAgrupacion()!=null){
                    numagrupacion=agrupacionRepository.findById(unidadDeVivienda.getIdAgrupacion()).get().getNumero();
                    nombreagrupacion=tipoAgrupacionRepository.findById(tipoAgrupacionConjuntoRepository.findById(agrupacionRepository.findById(unidadDeVivienda.getIdAgrupacion()).get().getIdtipoagrupacionconjunto()).get().getIdTipoAgrupacion()).get().getNombre();
                }
                jsonObject=new JSONObject("{\"nombreconjunto\": \""+ conjuntoRepository.findById(conjuntoUsuario1.getIdConjunto()).get().getNombre() +"\"," +
                        "\"tipoagrupacion\": \"" + nombreagrupacion + "\"," +
                        "\"numagrupacion\": \"" + numagrupacion + "\"," +
                        "\"tipoinmueble\": \"" + tipoInmuebleRepository.findById(tipoInmuebleConjuntoRepository.findById(unidadDeVivienda.getIdTipoInmuebleConjunto()).get().getIdTipoInmueble()).get().getNombre() + "\"," +
                        "\"numinmueble\": \"" + unidadDeVivienda.getNumInmueble() + "\"," +
                        "\"idconjunto\": \"" + conjuntoRepository.findById(conjuntoUsuario1.getIdConjunto()).get().getId() + "\"," +
                        "\"idunidaddevivienda\": \"" + unidadDeVivienda.getId() + "\"}");
                json.put(jsonObject.toMap());
                numagrupacion= null;
                nombreagrupacion=null;
            }
        }
        return json;
    }

    @Override
    public Conjunto getConjuntoById(int id) {
        return conjuntoRepository.findById(id).get();
    }

    @Override
    public Usuario getUsuarioById(int id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public ConjuntoUsuario getConjuntoUsuarioByConjuntoUsuario(int idconjunto, int idusuario) {
        return conjuntoUsuarioRepository.findConjuntoUsuarioByConjuntoUsuario(idconjunto,idusuario);
    }

    @Override
    public UnidadDeVivienda getUnidadDeViviendaByID(int id) {
        return unidadDeViviendaRepository.findById(id).get();
    }

    @Override
    public UnidadDeViviendaUsuario getUnidadDeVivendaUsuarioByID(int idUnidadDeVivienda, int idConjuntoUsuario) {
        return unidadDeViviendaUsuarioRepository.findUnidadDeVivendaUsuarioById(idUnidadDeVivienda,idConjuntoUsuario);
    }

    @Override
    public Agrupacion getAgrupacionByID(int idAgrupacion) {
        return agrupacionRepository.findById(idAgrupacion).get();
    }

    @Override
    public TipoAgrupacion getTipoAgrupacionByID(int idTipoAgrupacion) {
        return tipoAgrupacionRepository.findById(idTipoAgrupacion).get();
    }

    @Override
    public TipoInmueble getTipoinmuebleByID(int idTipoInmueble) {
        return tipoInmuebleRepository.findById(idTipoInmueble).get();
    }

    @Override
    public TipoAgrupacionConjunto getTipoAgrupacionConjuntoByID(int idTipoAgrupacionConjunto) {
        return tipoAgrupacionConjuntoRepository.findById(idTipoAgrupacionConjunto).get();
    }

    @Override
    public TipoInmuebleConjunto getTipoInmuebleConjuntoByID(int idTipoInmuebleConjunto) {
        return tipoInmuebleConjuntoRepository.findById(idTipoInmuebleConjunto).get();
    }

    @Override
    public List<ZonaComunConjunto> getZonasComunesConjuntoByIdConjunto(int idconjunto) {
        return zonaComunConjuntoRepository.findZonasComunesConjuntoByIdConjunto(idconjunto);
    }

    @Override
    public List<ZonaComun> getZonasComunesByZonasComunesConjunto(List<ZonaComunConjunto> zonasComunesConjunto) {
        List<ZonaComun> zonasComunes=new ArrayList<>();
        for (ZonaComunConjunto zonaComunConjunto: zonasComunesConjunto){
            zonasComunes.add(zonaComunRepository.findById(zonaComunConjunto.getIdZonaComun()).get());
        }
        return zonasComunes;
    }

    @Override
    public ConjuntoAdministrador getCojuntoAdministradorByID(int idConjuntoAdministrador) {
        return conjuntoAdministradorRepository.findById(idConjuntoAdministrador).get();
    }

    @Override
    public List<ZonaComun> getZonasComunes() {
        return zonaComunRepository.findAll();
    }

    @Override
    public List<ConjuntoUsuario> getConjuntoUsuarioByIDConjunto(int idconjunto) {
        return conjuntoUsuarioRepository.ConjuntoUsuarioByIDConjunto(idconjunto);
    }

    @Override
    public List<Usuario> getUsuariosByConjuntoUsuarios(List<ConjuntoUsuario> ConjuntoUsuarios) {
        List<Usuario> Usuarios =new ArrayList<>();
        for (ConjuntoUsuario conjuntoUsuario: ConjuntoUsuarios){
            Usuarios.add(usuarioRepository.findById(conjuntoUsuario.getIdUsuario()).get());
        }
        return Usuarios;
    }

    @Override
    public List<UnidadDeViviendaUsuario> getUnidadesDeViviendaUsuariosByConjuntoUsuarios(List<ConjuntoUsuario> ConjuntoUsuarios) {

        List<UnidadDeViviendaUsuario> unidadesDeViviendaUsuarios=new ArrayList<>();
        List<UnidadDeViviendaUsuario> unidadDeViviendaUsuarioList=unidadDeViviendaUsuarioRepository.findAll();
        for (UnidadDeViviendaUsuario unidadDeViviendaUsuario:unidadDeViviendaUsuarioList){
            for (ConjuntoUsuario conjuntoUsuario: ConjuntoUsuarios){
                if(unidadDeViviendaUsuario.getIdConjuntoUsuario().equals(conjuntoUsuario.getId())){
                    unidadesDeViviendaUsuarios.add(unidadDeViviendaUsuario);
                }
            }
        }
        return unidadesDeViviendaUsuarios;
    }

    @Override
    public List<UnidadDeVivienda> getUnidadesDeViviendaByIdConjunto(int idconjunto) {
        List<UnidadDeVivienda> unidadesDeVivienda=new ArrayList<>();
        List<UnidadDeVivienda> unidadDeViviendaList=unidadDeViviendaRepository.findAll();
        for(UnidadDeVivienda unidadDeVivienda: unidadDeViviendaList){
            if (tipoInmuebleConjuntoRepository.findById(unidadDeVivienda.getIdTipoInmuebleConjunto()).get().getIdConjunto().equals(idconjunto)){
                unidadesDeVivienda.add(unidadDeVivienda);
            }
        }
        return unidadesDeVivienda;
    }

    @Override
    public List<Agrupacion> getAgrupacionByIdConjunto(int idconjunto) {
        List<Agrupacion> agrupaciones =new ArrayList<>();
        List<Agrupacion> agrupacionList = agrupacionRepository.findAll();
        for (Agrupacion agrupacion: agrupacionList){
            if (tipoAgrupacionConjuntoRepository.findById(agrupacion.getIdtipoagrupacionconjunto()).get().getIdConjunto().equals(idconjunto)){
                agrupaciones.add(agrupacion);
            }
        }
        return agrupaciones;
    }

    @Override
    public List<TipoInmuebleConjunto> getTipoInmuebleConjuntoByIdConjunto(int idconjunto) {
        return tipoInmuebleConjuntoRepository.findByIdConjunto(idconjunto);
    }

    @Override
    public List<TipoAgrupacionConjunto> getTipoAgrupacionConjuntoByIdConjunto(int idconjunto) {
        return tipoAgrupacionConjuntoRepository.findTipoAgrupacionConjuntoByIdConjunto(idconjunto);
    }

    @Override
    public List<Alquiler> getAlquileres(List<ZonaComunConjunto> zonascomunes) {
        List<Alquiler> alquileres = new ArrayList<>();
        List<Alquiler> alquilerList = alquilerRepository.findAll();
        for (Alquiler alquiler:alquilerList){
            for (ZonaComunConjunto zonaComunConjunto:zonascomunes){
                if (alquiler.getIdzonacomun().equals(zonaComunConjunto.getId())){
                    alquileres.add(alquiler);
                }
            }
        }
        return alquileres;
    }

    @Override
    public JSONArray getHorasInicioAlquiler(long fechai, long fechaf, long fecham, String fechainicio,int idZonaComun) throws ParseException {
        List<Alquiler> alquilerList = alquilerRepository.findAlquileresByFecha(fechai,fechaf,idZonaComun);
        Alquiler alquilerNext = alquilerRepository.findAlquilereMenorDiaSiguiente(fechaf,fecham,idZonaComun);
        ZonaComunConjunto zonaComunConjunto = zonaComunConjuntoRepository.findZonsComunById(idZonaComun);
        JSONObject jsonObject;
        JSONArray json = new JSONArray();
        LocalDate actual = LocalDate.parse(fechainicio, lformat);
        LocalDateTime local = LocalDateTime.of(actual.getYear(),actual.getMonth(),actual.getDayOfMonth(),0,0);
        LocalDateTime local1 = LocalDateTime.of(actual.getYear(),actual.getMonth(),actual.getDayOfMonth(),0,0);
        local1=local1.plusDays(1).minusHours(5);
        String hora = local.getHour()+":"+local.getMinute();
        if (local.getMinute()==0){hora+="0";}
        String horafin = "23:45";
        int lapso = (zonaComunConjunto.getTiempoAlquilerCobro()+zonaComunConjunto.getTiempodeespera())*60000;
        if (alquilerNext!= null){
            long inicioOtro = alquilerNext.getIniciodealquiler();
            long minutosOtro= (inicioOtro % 3600000)/60000;
            inicioOtro-=(minutosOtro*60000);
            long horasOtro =  (inicioOtro % 86400000)/3600000;
            local1=local1.plusHours(horasOtro);
            local1= local1.plusMinutes(minutosOtro);
            local1= local1.minusMinutes(lapso/60000);
            horafin = local1.getHour()+":"+local1.getMinute();
        }
        boolean primer=true;
        for (Alquiler alquiler:alquilerList){
            primer=true;
            while (primer){
                if (hora.equals(simpleDateFormat.format(alquiler.getIniciodealquiler()-lapso))){primer=false;}
                jsonObject=new JSONObject("{\"horainicio\": \""+ hora +"\"}");
                local = local.plusMinutes(15);
                hora=local.getHour()+":"+local.getMinute();
                if (local.getMinute()==0){hora+="0";}
                json.put(jsonObject.toMap());
            }
            local = local.plusMinutes((lapso/30000)-15);
        }
        hora=local.getHour()+":"+local.getMinute();
        boolean noCruza = true;
        while (actual.getYear()==local.getYear() && actual.getMonth()==local.getMonth() && actual.getDayOfMonth()==local.getDayOfMonth() && noCruza){
            if (hora.equals(horafin) ){noCruza=false;}
            jsonObject=new JSONObject("{\"horainicio\": \""+ hora +"\"}");
            local = local.plusMinutes(15);
            hora=local.getHour()+":"+local.getMinute();
            if (local.getMinute()==0){hora+="0";}
            json.put(jsonObject.toMap());
        }
        return json;
    }

    @Override
    public JSONArray getHorasFinAlquiler(long fechai, String fechainicio, String horainicio, int idZonaComun) {
        JSONArray json = new JSONArray();
        ZonaComunConjunto zonaComunConjunto = zonaComunConjuntoRepository.findZonsComunById(idZonaComun);
        long fechaf=fechai+(zonaComunConjunto.getTiempomaximoalquiler()*60000);
        LocalDateTime inicio = LocalDateTime.parse(fechainicio+" "+horainicio, hformat);
        LocalDateTime fin = inicio.plusMinutes(zonaComunConjunto.getTiempomaximoalquiler());
        JSONObject jsonObject;
        String hora;
        boolean otro=true;
        Alquiler alquiler = alquilerRepository.findInMiddle(fechai,fechaf,idZonaComun,zonaComunConjunto.getTiempodeespera() * 60000);
        if (alquiler!=null) {
            LocalDateTime fecham = LocalDateTime.parse(simpleDateFormatH.format(alquiler.getIniciodealquiler() - (zonaComunConjunto.getTiempodeespera() * 60000)), hformat);
            System.out.println(fecham);
            if (fecham.isBefore(fin) ) {fin = fecham;}
        }
        while (otro){
            inicio=inicio.plusMinutes(zonaComunConjunto.getTiempoAlquilerCobro());
            if (inicio.toString().equals(fin.toString())){otro=false;}
            hora = inicio.getYear()+"-"+inicio.getMonthValue()+"-"+ inicio.getDayOfMonth()+" "+inicio.getHour()+":"+inicio.getMinute();
            if (inicio.getMinute()==0){hora+="0";}
            jsonObject=new JSONObject("{\"fin\": \""+ hora +"\"}");
            json.put(jsonObject.toMap());
        }
        return json;
    }

    @Override
    public Usuario userByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    @Override
    public Object postAgrupacion(Agrupacion agrupacion) {
        agrupacion.setId(Math.toIntExact(agrupacionRepository.count())+1);
        return agrupacionRepository.save(agrupacion);
    }

    @Override
    public Object postConjuntoUsuario(ConjuntoUsuario conjuntoUsuario) {
        conjuntoUsuario.setId(Math.toIntExact(conjuntoUsuarioRepository.count()+1));
        return conjuntoUsuarioRepository.save(conjuntoUsuario);
    }

    @Override
    public Object postzonaComunConjunto(ZonaComunConjunto zonaComunConjunto) {
        zonaComunConjunto.setId(Math.toIntExact(zonaComunConjuntoRepository.count()+1));
        return zonaComunConjuntoRepository.save(zonaComunConjunto);
    }

    @Override
    public Object postTipoAgrupacion(TipoAgrupacionConjunto agrupacionConjunto) {
        agrupacionConjunto.setId(Math.toIntExact(tipoAgrupacionConjuntoRepository.count()+1));
        return tipoAgrupacionConjuntoRepository.save(agrupacionConjunto);
    }

    @Override
    public Object postTipoInmueble(TipoInmuebleConjunto inmuebleConjunto) {
        inmuebleConjunto.setId(Math.toIntExact(tipoInmuebleConjuntoRepository.count()+1));
        return tipoInmuebleConjuntoRepository.save(inmuebleConjunto);
    }

    @Override
    public Object postUnidadDeVivinenda(UnidadDeVivienda unidadDeVivienda) {
        unidadDeVivienda.setId(Math.toIntExact(unidadDeViviendaRepository.count()+1));
        return unidadDeViviendaRepository.save(unidadDeVivienda);
    }

    @Override
    public Object postUnidadDeViviendaUsuario(UnidadDeViviendaUsuario unidadDeViviendaUsuario) {
        unidadDeViviendaUsuario.setId(Math.toIntExact(unidadDeViviendaUsuarioRepository.count())+1);
        return unidadDeViviendaUsuarioRepository.save(unidadDeViviendaUsuario);
    }

    @Override
    public Object postUsuario(Usuario usuario) {
        usuario.setId(Math.toIntExact(usuarioRepository.count())+1);
        return usuarioRepository.save(usuario);
    }

    @Override
    public Object putUnidadDeVivinenda(UnidadDeVivienda unidadDeVivienda) {
        UnidadDeVivienda unidadDeViviendaDB = unidadDeViviendaRepository.findById(unidadDeVivienda.getId()).get();
        unidadDeViviendaDB.setCostoAdministracion(unidadDeVivienda.getCostoAdministracion());
        return unidadDeViviendaRepository.save(unidadDeViviendaDB);
    }

    @Override
    public Object putzonaComunConjunto(ZonaComunConjunto zonaComunConjunto) {
        ZonaComunConjunto zonaComunConjuntoDB = zonaComunConjuntoRepository.findById(zonaComunConjunto.getId()).get();
        zonaComunConjuntoDB.setCostoAlquiler(zonaComunConjunto.getCostoAlquiler());
        zonaComunConjuntoDB.setTiempoAlquilerCobro(zonaComunConjunto.getTiempoAlquilerCobro());
        zonaComunConjuntoDB.setDisponible(zonaComunConjunto.getDisponible());
        return zonaComunConjuntoRepository.save(zonaComunConjuntoDB);
    }

    @Override
    public Object putUnidadDeViviendaUsuario(UnidadDeViviendaUsuario unidadDeViviendaUsuario) {
        UnidadDeViviendaUsuario unidadDeViviendaUsuarioDB = unidadDeViviendaUsuarioRepository.findById(unidadDeViviendaUsuario.getId()).get();
        unidadDeViviendaUsuarioDB.setDisponible(unidadDeViviendaUsuario.getDisponible());
        unidadDeViviendaUsuarioDB.setTipoHabitante(unidadDeViviendaUsuario.getTipoHabitante());
        return unidadDeViviendaUsuarioRepository.save(unidadDeViviendaUsuarioDB);
    }

    @Override
    public Object putUsuarioPropio(Usuario usuario) {
        Usuario usuario1=usuarioRepository.findById(usuario.getId()).get();
        usuario1.setPassword(usuario.getPassword());
        return usuarioRepository.save(usuario1);
    }

    @Override
    public Object putAlquiler(int id) {
        Alquiler alquiler = alquilerRepository.findById(id).get();
        alquiler.setCancelado(true);
        return alquilerRepository.save(alquiler);
    }

    @Override
    public TipoAgrupacionConjunto getTipoAgrupacionConjuntoById(int id) {
        return tipoAgrupacionConjuntoRepository.findById(id).get();
    }

    @Override
    public TipoInmuebleConjunto getTipoInmuebleConjuntoById(int id) {
        return tipoInmuebleConjuntoRepository.findById(id).get();
    }

    @Override
    public TipoAgrupacion getTipoAgrupacionById(int id) {
        return tipoAgrupacionRepository.findById(id).get();
    }

    @Override
    public TipoInmueble getTipoInmuebleById(int id) {
        return tipoInmuebleRepository.findById(id).get();
    }

    @Override
    public List<Alquiler> getAlquileresCliente(int idunidaddeviviendausuario) {
        return alquilerRepository.getAlquilerCliente(idunidaddeviviendausuario);
    }

    @Override
    public Object postAlquiler(long inicio, long fin, int idzonacomun, Integer id) {
        int tiempo = (int) (((fin-inicio)/60000)/zonaComunConjuntoRepository.findZonsComunById(idzonacomun).getTiempoAlquilerCobro());
        Alquiler alquiler = new Alquiler(Math.toIntExact(unidadDeViviendaUsuarioRepository.count())+1,idzonacomun,id,inicio,fin,zonaComunConjuntoRepository.findZonsComunById(idzonacomun).getCostoAlquiler()*tiempo,false);
        return alquilerRepository.saveAndComprobate(alquiler,inicio,fin);
    }
}
