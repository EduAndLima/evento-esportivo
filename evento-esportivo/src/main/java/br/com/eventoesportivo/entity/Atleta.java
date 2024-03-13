package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="ATLETA")
public class Atleta{
	@Id
	@Column(name = "ID_ATLETA")
	private Long idAtleta;
	/*
  `NOME_ATLETA` VARCHAR(100) NOT NULL,
  `DT_NASCIMENTO_ATLETA` DATE NOT NULL,
  `DT_INCLUSAO_ATLETA` DATE NOT NULL,
  `DT_EXCLUSAO_ATLETA` DATE DEFAULT NULL,
  `EMAIL_ATLETA` VARCHAR(100) DEFAULT NULL,
  `TELEFONE_ATLETA` VARCHAR(20) DEFAULT NULL,
  `ID_TIPO_VINCULO` INT(11) NOT NULL*/
  }
