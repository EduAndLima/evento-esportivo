package br.com.eventoesportivo.controller.dto;


import lombok.Data;

import java.time.Instant;

@Data
public class IncluirAplicacaoResponse {
    private Long idAplicacao;
    private String descAplicacao;
    private Instant dataCriacaoAplicacao;    
}
