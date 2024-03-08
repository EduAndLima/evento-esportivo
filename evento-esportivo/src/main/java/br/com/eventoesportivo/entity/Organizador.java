package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="ORGANIZADOR")
public class Organizador {
    @Id
	@Column(name = "ID_ORGANIZADOR")
	private Long idOrganizador;
	/*
  `NOME_ORGANIZADOR` VARCHAR(60) NOT NULL,
  `ID_TIPO_ORGANIZADOR` INT(11) NOT NULL,
  `DT_INCLUSAO_ORGANIZADOR` DATE NOT NULL,
  `DT_EXCLUSAO_ORGANIZADO` DATE DEFAULT NULL,
  `EMAIL_ORGANIZADOR` VARCHAR(100) DEFAULT NULL,
  `TELEFONE_ORGANIZADOR` VARCHAR(30) DEFAULT NULL*/
}
