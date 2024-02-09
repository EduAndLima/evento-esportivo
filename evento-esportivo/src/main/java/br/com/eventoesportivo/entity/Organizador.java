package br.com.eventoesportivo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="ORGANIZADOR")
public class Organizador {
	@Id
	@Column(name = "ID_ORGANIZADOR")
	private Long idOrganizador;

	@Column(name = "NOME_ORGANIZADOR")
	private String nomeOrganizador;

	// mapear id_tipo_organizador para tipo_organizador
	
	@Column(name = "DT_INCLUSAO_ORGANIZADOR")
	private LocalDateTime dataCriacaoOrganizador;
	
	@Column(name = "DT_EXCLUSAO_ORGANIZADOR")
	private LocalDateTime dataExclusaoOrganizador;
	
	@Column(name = "EMAIL_ORGANIZADOR")
	private String emailOrganizador;
	
	@Column(name = "TELEFONE_ORGANIZADOR")
	private String telefoneOrganizador;
}