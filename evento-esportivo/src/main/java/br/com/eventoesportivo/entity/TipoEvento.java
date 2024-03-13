package br.com.eventoesportivo.entity;

<<<<<<< HEAD
=======
import java.io.Serializable;
import java.time.LocalDateTime;

>>>>>>> origin/main
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

<<<<<<< HEAD
@Entity
@Table(schema="DBFUT", name="TIPO_EVENTO")
public class TipoEvento {
    @Id
	@Column(name = "ID_TIPO_EVENTO")
	private Long idTipoEvento;
	/*
  `DESC_TIPO_EVENTO` VARCHAR(50) NOT NULL,
  `DT_CRIACAO_TIPO_EVENTO` DATETIME NOT NULL,
  `DT_EXCLUSAO_TIPO_EVENTO` DATETIME DEFAULT NULL*/
    }
=======
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema="DBFUT", name="TIPO_EVENTO")
public class TipoEvento implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_TIPO_EVENTO")
	private Long idTipoEvento;

	@Column(name = "DESC_TIPO_EVENTO")
	private String descTipoEvento;

	@Column(name = "DT_CRIACAO_TIPO_EVENTO")
	private LocalDateTime dataCriacaoTipoEvento;
	
	@Column(name = "DT_EXCLUSAO_TIPO_EVENTO")
	private LocalDateTime dataExclusaoTipoEvento;
	
	public boolean naoExcluido()
	{
		return dataExclusaoTipoEvento.toString().isEmpty();
	}
}
>>>>>>> origin/main
