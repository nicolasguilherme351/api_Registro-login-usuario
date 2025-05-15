// ProfessorService.java
package com.nicolas.api_Registro_login_usuario.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicolas.api_Registro_login_usuario.entities.Usuario;
import com.nicolas.api_Registro_login_usuario.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;

	public Usuario logar(String nome, String senha) {
		Optional<Usuario> category = repository.findByNomeAndSenha(nome, senha);
		return category.get();
	} 
	/*
	 * public List<Usuario> findAll() { return repository.findAll(); }
	 * 
	 * public Usuario save(String nome, Integer idade) { // Usuario usuario = new
	 * Usuario(null, nome, idade); return repository.save(usuario); }
	 * 
	 */
}
