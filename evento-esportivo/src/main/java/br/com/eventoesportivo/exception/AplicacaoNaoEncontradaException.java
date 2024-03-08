package br.com.eventoesportivo.exception;

public class AplicacaoNaoEncontradaException extends RuntimeException{
	public AplicacaoNaoEncontradaException(String mensagem) {
	    super(mensagem);
	}
}
