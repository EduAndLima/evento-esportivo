package br.com.eventoesportivo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(schema="DBFUT", name="APLICACAO")
public class Aplicacao {
	@Id
	@Column(name = "ID_APLICACAO")
	private Long idAplicacao;

	@Column(name = "DESC_APLICACAO")
	private string descAplicacao;

	@Column(name = "DT_APLICACAO")
	private LocalDateTime dataAplicacao;
	
}
