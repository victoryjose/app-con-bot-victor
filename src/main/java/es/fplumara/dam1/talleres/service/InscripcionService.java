package es.fplumara.dam1.talleres.service;

import es.fplumara.dam1.talleres.dto.DeleteSummaryDTO;
import es.fplumara.dam1.talleres.model.Inscripcion;
import es.fplumara.dam1.talleres.model.Rol;
import es.fplumara.dam1.talleres.model.Usuario;

import java.util.List;

public interface InscripcionService {

    Inscripcion inscribirUsuario(Long tallerId, Long usuarioId, Rol rol);

    void cambiarRol(long tallerId, long usuarioId, Rol nuevoRol);

    void expulsarUsuario(DeleteSummaryDTO deleteSummaryDTO);

    List<Inscripcion> listarInscripcionesDeTaller(long tallerId);

    List<Usuario> listarInscripcionesDeUsuario(long usuarioId);

    List<Usuario> verMiembrosAgrupadosPorPerfil(long tallerID);

    List<Usuario> verResponsables(long tallerId);

}