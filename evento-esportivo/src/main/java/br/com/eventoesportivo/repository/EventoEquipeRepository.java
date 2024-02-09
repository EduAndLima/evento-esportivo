package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.EventoEquipe;

@Repository
public interface EventoEquipeRepository extends JpaRepository<EventoEquipe, Long>{

}
