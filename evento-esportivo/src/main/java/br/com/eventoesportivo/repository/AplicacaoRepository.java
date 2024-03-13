package br.com.eventoesportivo.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.eventoesportivo.entity.Aplicacao;

@Repository
public interface AplicacaoRepository extends JpaRepository<Aplicacao, Long>{

	List<Aplicacao> findAll();
}
