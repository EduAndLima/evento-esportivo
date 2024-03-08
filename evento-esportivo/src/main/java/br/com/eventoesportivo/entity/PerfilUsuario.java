package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="PERFIL_USUARIO")
public class PerfilUsuario {
    @Id
	@Column(name = "ID_USUARIO")
	private Long idUsuario;
   // `ID_PERFIL` INT(11) NOT NULL
}