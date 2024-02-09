package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.Jogo;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long>{

}
