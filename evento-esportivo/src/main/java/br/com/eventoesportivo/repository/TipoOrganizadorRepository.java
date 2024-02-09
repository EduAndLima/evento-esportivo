package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.TipoOrganizador;

@Repository
public interface TipoOrganizadorRepository extends JpaRepository<TipoOrganizador, Long>{

}
