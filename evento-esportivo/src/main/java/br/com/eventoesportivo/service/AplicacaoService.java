package br.com.eventoesportivo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eventoesportivo.controller.dto.IncluirAplicacaoRequest;
import br.com.eventoesportivo.entity.Aplicacao;
import br.com.eventoesportivo.exception.AplicacaoNaoEncontradaException;
import br.com.eventoesportivo.repository.AplicacaoRepository;

@Service
public class AplicacaoService {
    
	@Autowired
    AplicacaoRepository aplicacaoRepository;

    public AplicacaoService(AplicacaoRepository aplicacaoRepository) {
        this.aplicacaoRepository = aplicacaoRepository;
    }

    public List<Aplicacao> listar() {
        return aplicacaoRepository.findAll();
    }

    public Aplicacao getAplicacao(Long id) {
        return aplicacaoRepository.findById(id)
                .orElseThrow(() -> new AplicacaoNaoEncontradaException("Aplicação não encontrada: " + id));
    }

    public Aplicacao incluir(IncluirAplicacaoRequest aplicacaoRequest) {
        
        var aplicacao = new Aplicacao();
        BeanUtils.copyProperties(aplicacaoRequest, aplicacao);
        aplicacaoRepository.save(aplicacao);

        return aplicacao;
    }
    /*
    public Aplicacao atualizar(AtualizarAplicacaoRequest atualizarAplicacaoRequest) {
        var aplicacao = aplicacaoRepository.findById(atualizarAplicacaoRequest.getId()).get();

        BeanUtils.copyProperties(atualizarAplicacaoRequest, aplicacao);
        aplicacaoRepository.saveAndFlush(aplicacao);
        return aplicacao;
    }*/

    public void deletar(Long id) {
    	aplicacaoRepository.deleteById(id);
    }
}
