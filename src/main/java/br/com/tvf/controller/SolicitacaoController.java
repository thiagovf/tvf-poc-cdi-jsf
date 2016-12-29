package br.com.tvf.controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.tvf.model.Solicitacao;

@Named
@RequestScoped
public class SolicitacaoController {
	private Solicitacao solicitacao;

	public SolicitacaoController() {
		inicializarSolicitacao();
	}

	private void inicializarSolicitacao() {
		this.solicitacao = new Solicitacao();
	}

	public void enviar() {
		FacesContext.getCurrentInstance().addMessage("", new FacesMessage(
				String.format("Olá %s,sua solicitacao foi enviada com sucesso!", this.solicitacao.getNome())));

		inicializarSolicitacao();
	}
}
