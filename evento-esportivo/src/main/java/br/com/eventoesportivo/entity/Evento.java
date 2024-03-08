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
@Table(schema="DBFUT", name="EVENTO")
public class Evento {
	@Id
	@Column(name = "ID_EVENTO")
	private Long idEvento;

	@Column(name = "DESC_EVENTO")
	private String descEvento;

	@Column(name = "DT_INICIO_EVENTO")
	private LocalDateTime dataInicioEvento;
	
	@Column(name = "DT_FIM_EVENTO")
	private LocalDateTime dataFimEvento;
	
	@Column(name = "NOME_RESP_EVENTO")
	private String nomeResponsavelEvento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_EVENTO")
	private TipoEvento tipoEvento;
}
