package es.fplumara.dam1.talleres.service;

import es.fplumara.dam1.talleres.model.Usuario;

import java.util.List;

public interface UsuarioService {

    void crearUsuario (Usuario usuario);

    List<Usuario> listarUsuarios();

    Usuario obtenerUsuario (long idUsuario);

    void actualizarUsuario (long idUsuario, Usuario usuario);

    void eliminarUsuario(long Usuario);

}
