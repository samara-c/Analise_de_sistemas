package br.com.avaliacao.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.avaliacao.webapp.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

	UsuarioEntity findByLogin(String login);
	
}
