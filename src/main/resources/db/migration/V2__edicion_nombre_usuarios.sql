ALTER TABLE schema_usuarios.usuarios
    ADD p_apellido VARCHAR(30);

ALTER TABLE schema_usuarios.usuarios
    ADD p_nombre VARCHAR(30);

ALTER TABLE schema_usuarios.usuarios
    ALTER COLUMN p_apellido SET NOT NULL;

ALTER TABLE schema_usuarios.usuarios
    ALTER COLUMN p_nombre SET NOT NULL;

ALTER TABLE schema_usuarios.usuarios
    DROP COLUMN apellido_usuario;

ALTER TABLE schema_usuarios.usuarios
    DROP COLUMN nombre_usuario;