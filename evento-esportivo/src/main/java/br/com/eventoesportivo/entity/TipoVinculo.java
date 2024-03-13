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
@Table(schema="DBFUT", name="TIPO_VINCULO")
public class TipoVinculo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_TIPO_VINCULO")
	private Long idTipoVinculo;

	@Column(name = "DESC_TIPO_VINCULO")
	private String descTipoVinculo;

	@Column(name = "DT_INCLUSAO_TIPO_VINCULO")
	private LocalDateTime dataInclusaoTipoVinculo;
	
	@Column(name = "DT_EXCLUSAO_TIPO_VINCULO")
	private LocalDateTime dataExclusaoTipoVinculo;
	
	public boolean naoExcluido()
	{
		return dataExclusaoTipoVinculo.toString().isEmpty();
	}
}

