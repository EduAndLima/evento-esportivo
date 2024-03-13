package br.com.eventoesportivo.controller.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AtualizarAplicacaoRequest {
    private Long id;
    private String descAplicacao;
    private LocalDateTime dataCriacaoAplicacao;
    private LocalDateTime dataExclusaooAplicacao;
    
}
