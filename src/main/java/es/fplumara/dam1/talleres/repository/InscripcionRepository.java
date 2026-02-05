package es.fplumara.dam1.talleres.repository;

import es.fplumara.dam1.talleres.model.Inscripcion;
import es.fplumara.dam1.talleres.model.Rol;
import es.fplumara.dam1.talleres.model.Taller;
import es.fplumara.dam1.talleres.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface InscripcionRepository {

    public Inscripcion save(Inscripcion incripcion, Taller taller, Usuario usuario);

    public Optional<Inscripcion> findById(String id);

    public Inscripcion findByTallerIdAndUsuarioId(Long tallerId, Long usuarioId);

    public List<Inscripcion> findByTallerId(Long tallerId);

    public List<Inscripcion> findByUsuarioId(Long usuarioId);

    public List<Inscripcion> findByTallerAndRol(Long tallerId, Rol rol);

    public void deleteById(Long id);

    public void deleteByTallerIdAndUsuarioId(Long tallerId, Long usuarioId);

}
