package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="JOGO")
public class Jogo {
    @Id
	@Column(name = "ID_JOGO")
	private Long idJogo;
	/*
  `ID_EQUIPE_1` INT(11) NOT NULL,
  `ID_EQUIPE_2` INT(11) NOT NULL,
  `PLACAR_EQUIPE_1` INT(11) DEFAULT NULL,
  `PLACAR_EQUIPE_2` INT(11) DEFAULT NULL,
  `DT_JOGO` DATE NOT NULL,
  `HR_JOGO` TIME NOT NULL,
  `ID_EVENTO_EQUIPE` INT(11) NOT NULL
  `DT_INCLUSAO_JOGO` DATE NOT NULL,*/
}
