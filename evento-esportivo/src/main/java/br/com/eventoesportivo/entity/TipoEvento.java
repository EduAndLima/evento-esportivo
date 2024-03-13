package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="TIPO_EVENTO")
public class TipoEvento {
    @Id
	@Column(name = "ID_TIPO_EVENTO")
	private Long idTipoEvento;
	/*
  `DESC_TIPO_EVENTO` VARCHAR(50) NOT NULL,
  `DT_CRIACAO_TIPO_EVENTO` DATETIME NOT NULL,
  `DT_EXCLUSAO_TIPO_EVENTO` DATETIME DEFAULT NULL*/
    }