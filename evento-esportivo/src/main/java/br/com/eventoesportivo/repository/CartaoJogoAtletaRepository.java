package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.CartaoJogoAtleta;

@Repository
public interface CartaoJogoAtletaRepository extends JpaRepository<CartaoJogoAtleta, Long>{

}
