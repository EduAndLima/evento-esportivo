package br.com.eventoesportivo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(schema="DBFUT", name="INSCRICAO")
public class Inscricao {
	@Id
	@Column(name = "ID_INSCRICAO")
	private Long idInscricao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EVENTO")
	private Evento evento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ATLETA")
	private Atleta atleta;
	
	@Column(name = "DT_INSCRICAO")
	private LocalDateTime dataInscricao;
	
	@Column(name = "VALOR_PAGO_INSCRICAO")
	private Double valorPagoInscricao;
	
	@Column(name = "DT_EXCLUSAO_INSCRICAO")
	private LocalDateTime dataExclusaoInscricao;
}