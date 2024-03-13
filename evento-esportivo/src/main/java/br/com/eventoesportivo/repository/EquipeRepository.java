package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long>{

}
