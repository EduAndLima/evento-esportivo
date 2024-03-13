package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="TIPO_ORGANIZADOR")
public class TipoOrganizador {
    @Id
	@Column(name = "ID_TIPO_ORGANIZADOR")
	private Long idTipoOrganizador;
	/*
  `DESC_TIPO_ORGANIZADOR` VARCHAR(50) NOT NULL,
  `DT_INCLUSAO_TIPO_ORGANIZADOR` DATE NOT NULL,
  `DT_EXCLUSAO_TIPO_ORGANIZADOR` DATE DEFAULT NULL*/
    }
