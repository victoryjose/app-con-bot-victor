package es.fplumara.dam1.talleres.repository.impl;

import es.fplumara.dam1.talleres.model.Rol;
import es.fplumara.dam1.talleres.model.Taller;
import es.fplumara.dam1.talleres.model.Usuario;
import es.fplumara.dam1.talleres.repository.InscripcionRepository;
import es.fplumara.dam1.talleres.model.Inscripcion;

import java.util.*;

public class InMemoryInscripcionRepository implements InscripcionRepository {

    private Map<String, Inscripcion> inscripciones;

    public InMemoryInscripcionRepository() {
        inscripciones = new HashMap<String, Inscripcion>();
    }

    @Override
    public Inscripcion save(Inscripcion inscripcion, Taller taller, Usuario usuario) {
        if(inscripcion.getId()==null) {
            String clave = taller.getId().toString() + " | " + usuario.getId().toString();
            inscripcion.setId(clave);
        }
        inscripciones.put(inscripcion.getId(), inscripcion);
        return inscripcion;
    }

    @Override
    public Optional<Inscripcion> findById(String id) {
        return Optional.ofNullable(inscripciones.get(id));
    }

    @Override
    public Optional<Inscripcion> findByTallerIdAndUsuarioId(Taller taller, Usuario usuario) {
        for (Inscripcion inscripcion : inscripciones.values()) {
            String clave = taller.getId().toString() + " | " + usuario.getId().toString();
            if (inscripcion.getId().equals(clave)) {
                return Optional.ofNullable(inscripcion);
            }
        }
    }

    @Override
    public Optional<List<Taller>> findByTallerId(Long tallerId, Taller taller, Usuario usuario) {
        String clave = taller.getId().toString() + " | " + usuario.getId().toString();
        String[] partes = clave.split(" | ");
        Long idtallerSacadoDeIdInscripcion = Long.parseLong(partes[0]);
        List<Taller> talleresConEseId = new ArrayList<>();
        for (Inscripcion inscripcion : inscripciones.values()){
            if (tallerId.equals(idtallerSacadoDeIdInscripcion)){
                talleresConEseId.add(taller);
            }
        }
        return Optional.ofNullable(talleresConEseId);
    }

    @Override
    public List<Inscripcion> findByUsuarioId(Long usuarioId) {
        return List.of();
    }

    @Override
    public List<Inscripcion> findByTallerAndRol(Long tallerId, Rol rol) {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {
    }

    @Override
    public void deleteByTallerIdAndUsuarioId(Long tallerId, Long usuarioId) {
    }

}