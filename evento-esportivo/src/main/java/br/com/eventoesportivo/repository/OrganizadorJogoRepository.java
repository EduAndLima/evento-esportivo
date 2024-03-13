package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.OrganizadorJogo;

@Repository
public interface OrganizadorJogoRepository extends JpaRepository<OrganizadorJogo, Long>{

}
