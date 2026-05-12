package cl.hebraviva.usuarios_service.usuarios.controller;


import cl.hebraviva.usuarios_service.usuarios.dto.UsuarioRequestDTO;
import cl.hebraviva.usuarios_service.usuarios.dto.UsuarioResponseDTO;
import cl.hebraviva.usuarios_service.usuarios.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/ingresar")
    public ResponseEntity<UsuarioResponseDTO> guardarUsuario(UsuarioRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.guardarUsuario(dto));
    }

    @GetMapping("/obtener")
    public ResponseEntity<List<UsuarioResponseDTO>> listarUsuarios() {
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }

    @GetMapping("/obtener/{email}")
    public ResponseEntity<UsuarioResponseDTO> obtenerUsuarioPorEmail(@PathVariable String email) {
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
    }

}
