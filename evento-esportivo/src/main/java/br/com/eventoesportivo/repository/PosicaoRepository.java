package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.Posicao;

@Repository
public interface PosicaoRepository extends JpaRepository<Posicao, Long>{

}
