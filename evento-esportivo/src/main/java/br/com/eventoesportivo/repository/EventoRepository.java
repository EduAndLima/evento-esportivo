package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long>{

}
