package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema="DBFUT", name="PERMISSAO")
public class Permissao {
	
	@Id
	@Column(name = "ID_PERMISSAO")
	private Long idPermissao;
	//mapear aplicacao
	//mapear perfil
}