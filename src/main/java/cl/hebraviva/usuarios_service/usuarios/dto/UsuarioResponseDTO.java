package cl.hebraviva.usuarios_service.usuarios.dto;


import lombok.*;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponseDTO {
    private Long idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
}
