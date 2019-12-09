package br.com.cielo.dto;

import java.math.BigDecimal;

public class TbExtratoDTO {

	private Long id;
	private String dataLancamento;	
	private String descricao;	
	private Integer numero;	
	private BigDecimal valorFinal;	
	private String situacao;	
	private String dataConfirmacao;	
	private String dadosBancario;

	public TbExtratoDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getDataConfirmacao() {
		return dataConfirmacao;
	}

	public void setDataConfirmacao(String dataConfirmacao) {
		this.dataConfirmacao = dataConfirmacao;
	}

	public String getDadosBancario() {
		return dadosBancario;
	}

	public void setDadosBancario(String dadosBancario) {
		this.dadosBancario = dadosBancario;
	}

	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}

}
