package br.com.eventoesportivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eventoesportivo.entity.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long>{

}
