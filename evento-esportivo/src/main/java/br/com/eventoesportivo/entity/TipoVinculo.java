package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="TIPO_VINCULO")
public class TipoVinculo {
    @Id
	@Column(name = "ID_TIPO_VINCULO")
	private Long idTipoVinculo;
	/*
  `DESC_TIPO_VINCULO` VARCHAR(50) NOT NULL,
  `DT_INCLUSAO_TIPO_VINCULO` DATE NOT NULL,
  `DT_EXCLUSAO_TIPO_VINCULO` DATE DEFAULT NULL*/
  }