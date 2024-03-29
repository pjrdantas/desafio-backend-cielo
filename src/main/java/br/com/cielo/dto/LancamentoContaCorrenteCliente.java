package br.com.cielo.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ 
	"numeroRemessaBanco", 
	"nomeSituacaoRemessa", 
	"dadosDomicilioBancario", 
	"nomeTipoOperacao",
	"dadosAnaliticoLancamentoFinanceiroCliente" })
public class LancamentoContaCorrenteCliente {

	@JsonProperty("numeroRemessaBanco")
	private long numeroRemessaBanco;
	
	@JsonProperty("nomeSituacaoRemessa")
	private String nomeSituacaoRemessa;
	
	@JsonProperty("dadosDomicilioBancario")
	private DadosDomicilioBancario dadosDomicilioBancario;
	
	@JsonProperty("nomeTipoOperacao")
	private String nomeTipoOperacao;
	
	@JsonProperty("dadosAnaliticoLancamentoFinanceiroCliente")
	private List<Object> dadosAnaliticoLancamentoFinanceiroCliente = null;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	

	public LancamentoContaCorrenteCliente() {
	}

	/**
	 *
	 * @param numeroRemessaBanco
	 * @param dadosDomicilioBancario
	 * @param nomeTipoOperacao
	 * @param dadosAnaliticoLancamentoFinanceiroCliente
	 * @param nomeSituacaoRemessa
	 */
	public LancamentoContaCorrenteCliente(
			long numeroRemessaBanco, 
			String nomeSituacaoRemessa,
			DadosDomicilioBancario dadosDomicilioBancario, 
			String nomeTipoOperacao,
			List<Object> dadosAnaliticoLancamentoFinanceiroCliente) {
		super();
		this.numeroRemessaBanco = numeroRemessaBanco;
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
		this.dadosDomicilioBancario = dadosDomicilioBancario;
		this.nomeTipoOperacao = nomeTipoOperacao;
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}

	@JsonProperty("numeroRemessaBanco")
	public long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	@JsonProperty("numeroRemessaBanco")
	public void setNumeroRemessaBanco(long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	@JsonProperty("nomeSituacaoRemessa")
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	@JsonProperty("nomeSituacaoRemessa")
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	@JsonProperty("dadosDomicilioBancario")
	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	@JsonProperty("dadosDomicilioBancario")
	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	@JsonProperty("nomeTipoOperacao")
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	@JsonProperty("nomeTipoOperacao")
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	@JsonProperty("dadosAnaliticoLancamentoFinanceiroCliente")
	public List<Object> getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}

	@JsonProperty("dadosAnaliticoLancamentoFinanceiroCliente")
	public void setDadosAnaliticoLancamentoFinanceiroCliente(List<Object> dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}