package br.com.eventoesportivo.controller.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IncluirAplicacaoRequest {
    private String descAplicacao;
    private LocalDateTime dataCriacaoAplicacao;    
}