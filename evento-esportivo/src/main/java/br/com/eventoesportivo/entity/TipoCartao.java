package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="TIPO_CARTAO")
public class TipoCartao {
    @Id
	@Column(name = "ID_TIPO_CARTAO")
	private Long idTipoCartao;
	/*
  `DESC_TIPO_CARTAO` VARCHAR(50) NOT NULL,
  `DT_INCLUSAO_TIPO_CARTAO` DATE NOT NULL,
  `DT_EXCLUSAO_TIPO_CARTAO` DATE DEFAULT NULL*/
    }
