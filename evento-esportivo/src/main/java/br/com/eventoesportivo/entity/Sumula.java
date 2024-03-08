package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="SUMULA")
public class Sumula{
    @Id
	@Column(name = "ID_SUMULA")
	private Long idSumula;
	/*
  `ID_JOGO` INT(11) NOT NULL,
  `ID_ORGANIZADOR` INT(11) NOT NULL,
  `ID_EVENTO_EQUIPE` INT(11) NOT NULL*/
}

