package es.fplumara.dam1.talleres.service;

import es.fplumara.dam1.talleres.dto.UsuarioCreateDTO;
import es.fplumara.dam1.talleres.dto.UsuarioUpdateDTO;
import es.fplumara.dam1.talleres.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario crearUsuario (UsuarioCreateDTO usuarioCreateDTO);

    List<Usuario> listarUsuarios();

    Usuario obtenerUsuario (long idUsuario);
    void actualizarUsuario (UsuarioUpdateDTO usuarioUpdateDTO);

    void eliminarUsuario(long idUsuario);

}
