package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.TipoEvento;

@Repository
public interface TipoEventoRepository extends JpaRepository<TipoEvento, Long>{

}
