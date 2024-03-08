package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="USUARIO")
public class Usuario {
    @Id
	@Column(name = "ID_USUARIO")
	private Long idUsuario;
	/*
  `NOME_USUARIO` VARCHAR(100) NOT NULL,
  `DT_CRIACAO_USUARIO` DATETIME NOT NULL,
  `DT_EXCLUSAO_USUARIO` DATETIME DEFAULT NULL,
  `EMAIL_USUARIO` VARCHAR(100) NOT NULL,
  `SENHA_USUARIO` VARCHAR(32) NOT NULL*/
  }