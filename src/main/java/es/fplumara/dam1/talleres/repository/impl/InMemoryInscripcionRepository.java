package es.fplumara.dam1.talleres.repository.impl;

import es.fplumara.dam1.talleres.model.Rol;
import es.fplumara.dam1.talleres.model.Taller;
import es.fplumara.dam1.talleres.model.Usuario;
import es.fplumara.dam1.talleres.repository.InscripcionRepository;
import es.fplumara.dam1.talleres.model.Inscripcion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


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
    public Inscripcion findByTallerIdAndUsuarioId(Long tallerId, Long usuarioId) {
        for (Inscripcion inscripcion : inscripciones.values()) {
            if (inscripcion.getUsuarioId().equals(usuarioId) && inscripcion.getTallerId().equals(tallerId)) {
                return inscripcion;
            }
        }
        return null;
    }

    @Override
    public List<Inscripcion> findByTallerId(Long tallerId) {
        return List.of();
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