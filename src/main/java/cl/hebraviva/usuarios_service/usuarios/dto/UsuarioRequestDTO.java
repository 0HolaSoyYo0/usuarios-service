package cl.hebraviva.usuarios_service.usuarios.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import lombok.*;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequestDTO {

    @NotBlank(message = "El Nombre no debe estar Vacío.")
    @Size(max = 30, message = "El Nombre debe tener máximo 30 Caracteres.")
    private String nombreUsuario;

    @NotBlank(message = "El Apellido no debe estar Vacío.")
    @Size(max = 30, message = "El Apellido debe tener máximo 30 Caracteres.")
    private String apellidoUsuario;

    @NotBlank(message = "El teléfono no debe estar Vacío.")
    @Pattern(
            regexp = "^(\\+56)?9\\d{8}$",
            message = "Número de teléfono inválido"
    )
    private String telefonoUsuario;

    @Email(message = "El correo debe tener un formato Estándar valido.")
    @NotBlank(message = "El correo no debe estar Vacío.")
    @Size(max = 100, message = "El correo debe tener máximo 100 Caracteres.")
    private String emailUsuario;

    @NotBlank(message = "La contraseña no debe estar Vacía.")
    @Size(min = 8, max = 16, message = "La contraseña debe tener entre 8 y 16 caracteres.")
    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*\\d).+$",
            message = "La clave debe tener al menos una mayúscula y un número"
    )
    private String passwordUsuario;

}
