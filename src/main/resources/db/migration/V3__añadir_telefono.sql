ALTER TABLE schema_usuarios.usuarios
    ADD telefono VARCHAR(9);

ALTER TABLE schema_usuarios.usuarios
    ALTER COLUMN telefono SET NOT NULL;

ALTER TABLE schema_usuarios.usuarios
    ADD CONSTRAINT uc_usuarios_telefono UNIQUE (telefono);