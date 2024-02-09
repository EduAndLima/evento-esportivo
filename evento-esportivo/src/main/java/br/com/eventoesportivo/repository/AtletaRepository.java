package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.Atleta;

@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Long>{

}
