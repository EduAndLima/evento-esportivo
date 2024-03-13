package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.Inscricao;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, Long>{

}
