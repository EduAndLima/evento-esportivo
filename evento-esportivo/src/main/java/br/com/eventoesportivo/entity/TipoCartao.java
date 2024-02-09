package br.com.eventoesportivo.entity;

import java.time.LocalDateTime;

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

	@Column(name = "DESC_TIPO_CARTAO")
	private String descTipoCartao;

	@Column(name = "DT_INCLUSAO_TIPO_CARTAO")
	private LocalDateTime dataInclusaoTipoCartao;
	
	@Column(name = "DT_EXCLUSAO_TIPO_CARTAO")
	private LocalDateTime dataExclusaoTipoCartao;
}