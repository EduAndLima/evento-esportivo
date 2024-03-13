package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="ORGANIZADOR_JOGO")
public class OrganizadorJogo {
    @Id
	@Column(name = "ID_ORGANIZADOR_JOGO")
	private Long idOrganizadorJogo;
	/*
  `ID_ORGANIZADOR` INT(11) NOT NULL,
  `ID_JOGO` INT(11) NOT NULL,
  `DT_INCLUSAO_ORGANIZADOR_JOGO` DATE NOT NULL,
  `DT_EXCLUSAO_ORGANIZADOR_JOGO` DATE DEFAULT NULL,
  `ID_SUMULA` INT(11) NOT NULL*/
}
