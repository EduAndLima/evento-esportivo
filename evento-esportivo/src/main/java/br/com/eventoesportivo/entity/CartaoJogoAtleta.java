package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="CARTAO_JOGO_ATLETA")
public class CartaoJogoAtleta {
	@Id
	@Column(name = "ID_CARTAO_JOGO_ATLETA")
	private Long idCartaoJogoAtleta;
	/*
  `ID_ATLETA` INT(11) NOT NULL,
  `ID_JOGO` INT(11) NOT NULL,
  `ID_TIPO_CARTAO` INT(11) NOT NULL,
  `ID_SUMULA` INT(11) NOT NULL*/
	}