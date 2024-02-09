package br.com.eventoesportivo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema="DBFUT", name="INSCRICAO")
public class Inscricao {
	@Id
	@Column(name = "ID_INSCRICAO")
	private Long idInscricao;

	// mapear evento
	//mapear atleta
	
	@Column(name = "DT_INSCRICAO")
	private LocalDateTime dataInscricao;
	
	@Column(name = "VALOR_PAGO_INSCRICAO")
	private Double valorPagoInscricao;
	
	@Column(name = "DT_EXCLUSAO_INSCRICAO")
	private LocalDateTime dataExclusaoInscricao;
}