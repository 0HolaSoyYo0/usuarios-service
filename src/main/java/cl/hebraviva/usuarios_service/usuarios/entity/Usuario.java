package cl.hebraviva.usuarios_service.usuarios.entity;


import jakarta.persistence.*;

import lombok.*;


@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuarios", schema = "usuarios_service")
public class Usuario {

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(length = 30, nullable = false, name = "nom_usuario")
    private String nombreUsuario;

    @Column(length = 30, nullable = false, name = "ap_usuario")
    private String apellidoUsuario;

    @Column(length = 100, nullable = false, unique = true, name = "correo_usuario")
    private String emailUsuario;

    @Column(length = 12, nullable = false, unique = true, name = "telefono_usuario")
    private String telefonoUsuario;

    @Column(length = 16, nullable = false, unique = true, name = "clave_usuario")
    private String passwordUsuario;

}
