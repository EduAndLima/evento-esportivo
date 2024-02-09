package br.com.eventoesportivo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema="DBFUT", name="TIPO_DOCUMENTO")
public class TipoDocumento {
	@Id
	@Column(name = "ID_TIPO_DOCUMENTO")
	private Long idTipoDocumento;

	@Column(name = "DESC_TIPO_DOCUMENTO")
	private String descTipoDocumento;

	@Column(name = "DT_CRIACAO_TIPO_DOCUMENTO")
	private LocalDateTime dataCriacaoTipoDocumento;
	
	@Column(name = "DT_EXCLUSAO_TIPO_DOCUMENTO")
	private LocalDateTime dataExclusaoTipoDocumento;
}