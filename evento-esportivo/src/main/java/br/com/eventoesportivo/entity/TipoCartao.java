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
@Table(schema="DBFUT", name="TIPO_CARTAO")
public class TipoCartao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_TIPO_CARTAO")
	private Long idTipoCartao;

	@Column(name = "DESC_TIPO_CARTAO")
	private String descTipoCartao;

	@Column(name = "DT_INCLUSAO_TIPO_CARTAO")
	private LocalDateTime dataInclusaoTipoCartao;
	
	@Column(name = "DT_EXCLUSAO_TIPO_CARTAO")
	private LocalDateTime dataExclusaoTipoCartao;
	
	public boolean naoExcluido()
	{
		return dataExclusaoTipoCartao.toString().isEmpty();
	}
}

