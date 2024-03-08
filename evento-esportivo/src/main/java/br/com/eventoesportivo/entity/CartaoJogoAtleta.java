package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(schema="DBFUT", name="CARTAO_JOGO_ATLETA")
public class CartaoJogoAtleta {
	@Id
	@Column(name = "ID_CARTAO_JOGO_ATLETA")
	private Long idCartaoJogoAtleta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ATLETA")
	private Atleta atleta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_JOGO")
	private Jogo jogo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_CARTAO")
	private TipoCartao tipoCartao;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SUMULA")
	private Sumula sumula;
}