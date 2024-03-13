package br.com.eventoesportivo.entity;

<<<<<<< HEAD
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
=======
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema="DBFUT", name="PERFIL_USUARIO")
public class PerfilUsuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USUARIO")
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PERFIL")
	private Perfil perfil;
>>>>>>> origin/main
}