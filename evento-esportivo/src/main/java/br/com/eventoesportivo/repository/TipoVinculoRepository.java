package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.TipoVinculo;

@Repository
public interface TipoVinculoRepository extends JpaRepository<TipoVinculo, Long>{

}
