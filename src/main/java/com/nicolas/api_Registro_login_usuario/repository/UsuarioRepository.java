// ProfessorRepository.java
package com.nicolas.api_Registro_login_usuario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicolas.api_Registro_login_usuario.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	  Optional<Usuario> findByNomeAndSenha(String nome, String senha);
}
