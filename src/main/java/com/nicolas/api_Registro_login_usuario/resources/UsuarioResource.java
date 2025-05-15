// ProfessorController.java
package com.nicolas.api_Registro_login_usuario.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicolas.api_Registro_login_usuario.entities.Usuario;
import com.nicolas.api_Registro_login_usuario.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {
	
	@Autowired	
    private UsuarioService service;
	
	@GetMapping("/logar/{nome}/{senha}")
	public Usuario logar(@PathVariable String nome, @PathVariable String senha) {
		return service.logar(nome, senha);	
	}
    
/*
    @GetMapping
    public List<Usuario> listar() {
        return service.findAll();
    }

    @PostMapping("/{nome}/{idade}")
    public Usuario salvar(@PathVariable String nome, @PathVariable Integer idade) {
        return service.save(nome, idade);
    }
    */
}
