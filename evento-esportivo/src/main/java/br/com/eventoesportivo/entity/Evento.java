package br.com.eventoesportivo.entity;

<<<<<<< HEAD
=======
import java.io.Serializable;
>>>>>>> origin/main
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="EVENTO")
public class Evento {
    @Id
    @Column(name = "ID_EVENTO")
	private Long idEvento;
	
    @Column(name = "DESC_EVENTO")
	private String descEvento;
    
    @Column(name = "DT_INICIO_EVENTO")
	private LocalDateTime dataInicioEvento;

    @Column(name = "DT_FIM_EVENTO")
	private LocalDateTime dataFimEvento;
    
    @Column(name = "NOME_RESP_EVENTO")
	private String nomeRespEvento;
  
     //`ID_TIPO_EVENTO` INT(11) DEFAULT NULL
  }
=======
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
@Table(schema="DBFUT", name="EVENTO")
public class Evento implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_EVENTO")
	private Long idEvento;

	@Column(name = "DESC_EVENTO")
	private String descEvento;

	@Column(name = "DT_INICIO_EVENTO")
	private LocalDateTime dataInicioEvento;
	
	@Column(name = "DT_FIM_EVENTO")
	private LocalDateTime dataFimEvento;
	
	@Column(name = "NOME_RESP_EVENTO")
	private String nomeResponsavelEvento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_EVENTO")
	private TipoEvento tipoEvento;
	
}
>>>>>>> origin/main
