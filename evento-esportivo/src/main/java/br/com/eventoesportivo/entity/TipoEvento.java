package br.com.eventoesportivo.entity;

import java.time.LocalDateTime;

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

	@Column(name = "DESC_TIPO_EVENTO")
	private String descTipoEvento;

	@Column(name = "DT_CRIACAO_TIPO_EVENTO")
	private LocalDateTime dataCriacaoTipoEvento;
	
	@Column(name = "DT_EXCLUSAO_TIPO_EVENTO")
	private LocalDateTime dataExclusaoTipoEvento;
}
