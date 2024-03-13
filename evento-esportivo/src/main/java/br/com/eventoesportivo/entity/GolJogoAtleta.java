package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="GOL_JOGO_ATLETA")
public class GolJogoAtleta {
    @Id
	@Column(name = "ID_GOL_JOGO_ATLETA")
	private Long idGolJogoAtleta;
	/*
  `ID_ATLETA` INT(11) NOT NULL,
  `ID_JOGO` INT(11) NOT NULL,
  `ID_SUMULA` INT(11) NOT NULL,*/
   @Column(name = "QTD_GOL")
   private Long qtdGolsJogoAtleta;
}

