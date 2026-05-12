package cl.hebraviva.usuarios_service.usuarios.repository;


import cl.hebraviva.usuarios_service.usuarios.dto.UsuarioResponseDTO;
import cl.hebraviva.usuarios_service.usuarios.entity.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    
    boolean existsUsuarioByEmailUsuario(String emailUsuario);
    UsuarioResponseDTO findUsuarioByEmailUsuario(String emailUsuario);

}
