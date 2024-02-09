package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.TipoCartao;

@Repository
public interface TipoCartaoRepository extends JpaRepository<TipoCartao, Long>{

}
