ALTER TABLE schema_usuarios.usuarios
    ALTER COLUMN id_usuario
        ADD GENERATED ALWAYS AS IDENTITY;