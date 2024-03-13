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
@Table(schema="DBFUT", name="POSICAO")
public class Posicao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_POSICAO")
	private Long idPosicao;

	@Column(name = "DESC_POSICAO")
	private String descPosicao;

	@Column(name = "DT_CRIACAO_POSICAO")
	private LocalDateTime dataCriacaoPosicao;
	
	@Column(name = "DT_EXCLUSAO_POSICAO")
	private LocalDateTime dataExclusaoPosicao;
	
	public boolean naoExcluido()
	{
	return dataExclusaoPosicao.toString().isEmpty();
	}
}