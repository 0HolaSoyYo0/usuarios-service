package cl.hebraviva.usuarios_service.usuarios.repository;


import cl.hebraviva.usuarios_service.usuarios.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;


public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    
    boolean existsUsuarioByEmailUsuario(String emailUsuario);
    Collection<Usuario> findUsuarioByEmailUsuario(String emailUsuario);

}
