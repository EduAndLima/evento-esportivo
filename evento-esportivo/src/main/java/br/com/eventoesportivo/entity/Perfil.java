package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="PERFIL")
public class Perfil {
    @Id
	@Column(name = "ID_PERFIL")
	private Long idPerfil;
	/*
  `NOME_PERFIL` VARCHAR(50) NOT NULL,
  `DT_CRIACAO_PERFIL` DATETIME NOT NULL,
  `DT_EXCLUSAO_PERFIL` DATETIME NOT NULL*/
}
