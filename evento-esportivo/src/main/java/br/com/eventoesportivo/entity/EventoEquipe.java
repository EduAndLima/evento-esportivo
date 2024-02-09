package br.com.eventoesportivo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema="DBFUT", name="EVENTO_EQUIPE")
public class EventoEquipe {
	@Id
	@Column(name = "ID_EVENTO_EQUIPE")
	private Long idEquipe;
	
	//mapear evento
	//mapear equipe
	
	@Column(name = "DT_VINCULO")
	private LocalDateTime dataVinculoEventoEquipe;

}
