package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.GolJogoAtleta;

@Repository
public interface GolJogoAtletaRepository extends JpaRepository<GolJogoAtleta, Long>{

}
