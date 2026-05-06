CREATE TABLE schema_usuarios.usuarios
(
    id_usuario       BIGINT       NOT NULL,
    nombre_usuario   VARCHAR(30)  NOT NULL,
    apellido_usuario VARCHAR(30)  NOT NULL,
    email            VARCHAR(100) NOT NULL,
    "contraseña"     VARCHAR(16)  NOT NULL,
    CONSTRAINT pk_usuarios PRIMARY KEY (id_usuario)
);

ALTER TABLE schema_usuarios.usuarios
    ADD CONSTRAINT "uc_usuarios_contraseña" UNIQUE ("contraseña");

ALTER TABLE schema_usuarios.usuarios
    ADD CONSTRAINT uc_usuarios_email UNIQUE (email);