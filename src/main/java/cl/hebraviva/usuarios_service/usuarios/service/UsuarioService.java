package cl.hebraviva.usuarios_service.usuarios.service;


import cl.hebraviva.usuarios_service.usuarios.entity.Usuario;
import cl.hebraviva.usuarios_service.usuarios.exception.UsuarioNoEncontradoException;
import cl.hebraviva.usuarios_service.usuarios.mapper.MapperUsuarios;
import cl.hebraviva.usuarios_service.usuarios.dto.UsuarioRequestDTO;
import cl.hebraviva.usuarios_service.usuarios.dto.UsuarioResponseDTO;
import cl.hebraviva.usuarios_service.usuarios.repository.UsuarioRepository;
import cl.hebraviva.usuarios_service.usuarios.exception.UsuarioYaExisteException;

import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.ArrayList;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioResponseDTO guardarUsuario(UsuarioRequestDTO usuario) {
        if (usuarioRepository.existsUsuarioByEmailUsuario(usuario.getEmailUsuario())) {
            throw new UsuarioYaExisteException("Ya existe un usuario con este email");
        }
        usuarioRepository.save(MapperUsuarios.toEntity(usuario));
        return MapperUsuarios.toResponse(MapperUsuarios.toEntity(usuario));
    }

    public UsuarioResponseDTO buscarUsuarioPorEmail(String email) {
        if (!usuarioRepository.existsUsuarioByEmailUsuario(email)) {
            throw new UsuarioNoEncontradoException("No se encontró usuario con ese email");
        }
        return usuarioRepository.findUsuarioByEmailUsuario(email);
    }

    public List<UsuarioResponseDTO> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        for (Usuario usuario : usuarioRepository.findAll()) {
            usuarios.add(usuario);
        }
        return MapperUsuarios.allResponseDTO(usuarios);
    }

}
