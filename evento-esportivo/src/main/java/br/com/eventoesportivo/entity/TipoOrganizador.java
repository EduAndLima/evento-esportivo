package br.com.eventoesportivo.entity;

import java.time.LocalDateTime;

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

	@Column(name = "DESC_TIPO_ORGANIZADOR")
	private String descTipoOrganizador;

	@Column(name = "DT_INCLUSAO_TIPO_ORGANIZADOR")
	private LocalDateTime dataInclusaoTipoOrganizador;
	
	@Column(name = "DT_EXCLUSAO_TIPO_ORGANIZADOR")
	private LocalDateTime dataExclusaoTipoOrganizador;
}