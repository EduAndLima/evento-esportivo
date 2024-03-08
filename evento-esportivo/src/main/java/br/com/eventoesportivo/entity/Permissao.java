package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(schema="DBFUT", name="PERMISSAO")
public class Permissao {
	
	@Id
	@Column(name = "ID_PERMISSAO")
	private Long idPermissao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_APLICACAO")
	private Aplicacao aplicacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PERFIL")
	private Perfil perfil;
}