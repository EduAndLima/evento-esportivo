package br.com.eventoesportivo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema="DBFUT", name="EVENTO_EQUIPE")
public class EventoEquipe implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_EVENTO_EQUIPE")
	private Long idEquipe;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EVENTO")
	private Evento evento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EQUIPE")
	private Equipe equipe;
	
	@Column(name = "DT_VINCULO")
	private LocalDateTime dataVinculoEventoEquipe;

}
