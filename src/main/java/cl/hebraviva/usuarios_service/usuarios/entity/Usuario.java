package cl.hebraviva.usuarios_service.usuarios.entity;


import jakarta.persistence.*;

import lombok.*;


@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuarios", schema = "schema_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(length = 30, nullable = false)
    private String nombreUsuario;

    @Column(length = 30, nullable = false)
    private String apellidoUsuario;

    @Column(length = 100, nullable = false, unique = true, name = "email")
    private String emailUsuario;

    @Column(length = 16, nullable = false, unique = true, name = "contraseña")
    private String passwordUsuario;

}
