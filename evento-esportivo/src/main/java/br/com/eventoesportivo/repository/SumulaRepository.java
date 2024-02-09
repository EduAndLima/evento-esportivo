package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.Sumula;

@Repository
public interface SumulaRepository extends JpaRepository<Sumula, Long>{

}
