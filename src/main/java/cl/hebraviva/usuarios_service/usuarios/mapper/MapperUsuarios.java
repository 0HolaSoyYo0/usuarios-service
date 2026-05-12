package cl.hebraviva.usuarios_service.usuarios.mapper;


import cl.hebraviva.usuarios_service.usuarios.dto.UsuarioRequestDTO;
import cl.hebraviva.usuarios_service.usuarios.dto.UsuarioResponseDTO;
import cl.hebraviva.usuarios_service.usuarios.entity.Usuario;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class MapperUsuarios {

    public static UsuarioResponseDTO toResponse(Usuario entity) {
        UsuarioResponseDTO dto = new UsuarioResponseDTO();
        dto.setIdUsuario(entity.getIdUsuario());
        dto.setNombreUsuario(entity.getNombreUsuario());
        dto.setApellidoUsuario(entity.getApellidoUsuario());
        return dto;
    }

    public static List<UsuarioResponseDTO> allResponseDTO(List<Usuario> listaUsuarios) {
        List<UsuarioResponseDTO> dto = new ArrayList<>();
        for (Usuario usuario : listaUsuarios) {
            dto.add(toResponse(usuario));
        }
        return dto;
    }

    public static Usuario toEntity(UsuarioRequestDTO dto) {
        Usuario entity = new Usuario();
        entity.setNombreUsuario(dto.getNombreUsuario());
        entity.setApellidoUsuario(dto.getApellidoUsuario());
        entity.setEmailUsuario(dto.getEmailUsuario());
        entity.setTelefonoUsuario(dto.getTelefonoUsuario());
        entity.setPasswordUsuario(dto.getPasswordUsuario());
        return entity;
    }

}
