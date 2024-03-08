package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="INSCRICAO")
public class Inscricao {
    @Id
	@Column(name = "ID_INSCRICAO")
	private Long idInscricao;
	/*
  `ID_EVENTO` INT(11) NOT NULL,
  `ID_ATLETA` INT(11) NOT NULL,
  `DT_INSCRICAO` DATE NOT NULL,
  `VALOR_PAGO_INSCRICAO` DOUBLE DEFAULT NULL,
  `DT_EXCLUSAO_INSCRICAO` DATE DEFAULT NULL*/
}

