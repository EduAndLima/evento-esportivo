package br.com.eventoesportivo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.eventoesportivo.controller.dto.IncluirAplicacaoRequest;
import br.com.eventoesportivo.controller.dto.IncluirAplicacaoResponse;
import br.com.eventoesportivo.entity.Aplicacao;
import br.com.eventoesportivo.service.AplicacaoService;

@RestController
@RequestMapping("/api/aplicacao")
public class AplicacaoController {

    private final AplicacaoService aplicacaoService;
    private final ObjectMapper mapper = new ObjectMapper();

    public AplicacaoController(AplicacaoService aplicacaoService) {
        this.aplicacaoService = aplicacaoService;
    }

    @GetMapping()
    public ResponseEntity<List<Aplicacao>> listar() {
        return new ResponseEntity<>(aplicacaoService.listar(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aplicacao> ler(@PathVariable("id") Long id) {
        return new ResponseEntity<>(aplicacaoService.getAplicacao(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<IncluirAplicacaoResponse> incluir(@RequestParam String aplicacaoData) throws IOException {

        final var incluirAplicacaoRequest = mapper.readValue(aplicacaoData, IncluirAplicacaoRequest.class);
        
        var aplicacao = aplicacaoService.incluir(incluirAplicacaoRequest);

        var aplicacaoResponse = new IncluirAplicacaoResponse();
        BeanUtils.copyProperties(aplicacao, aplicacaoResponse);
        return new ResponseEntity<>(aplicacaoResponse, HttpStatus.CREATED);
    }
/*
    @PutMapping()
    public ResponseEntity<Aplicacao> atualizar(@RequestParam String aplicacaoData) throws IOException {
        final var atualizarAplicacaoRequest = mapper.readValue(aplicacaoData, AtualizarAplicacaoRequest.class);

        var aplicacao = aplicacaoService.atualizar(atualizarAplicacaoRequest);
        return new ResponseEntity<>(aplicacao, HttpStatus.OK);
    }
*/
    @DeleteMapping("{id}")
    public ResponseEntity<?> deletar(@PathVariable("id") Long id) {
        aplicacaoService.deletar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
