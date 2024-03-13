package br.com.eventoesportivo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema="DBFUT", name="TIPO_DOCUMENTO")
public class TipoDocumento implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_TIPO_DOCUMENTO")
	private Long idTipoDocumento;

	@Column(name = "DESC_TIPO_DOCUMENTO")
	private String descTipoDocumento;

	@Column(name = "DT_CRIACAO_TIPO_DOCUMENTO")
	private LocalDateTime dataCriacaoTipoDocumento;
	
	@Column(name = "DT_EXCLUSAO_TIPO_DOCUMENTO")
	private LocalDateTime dataExclusaoTipoDocumento;
	
	public boolean naoExcluido()
	{
		return dataExclusaoTipoDocumento.toString().isEmpty();
	}
}