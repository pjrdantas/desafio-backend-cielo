package br.com.cielo.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "quantidadeLancamentos", "quantidadeRemessas", "valorLancamentos" })
public class TotalControleLancamento {

	@JsonProperty("quantidadeLancamentos")
	private long quantidadeLancamentos;
	
	@JsonProperty("quantidadeRemessas")
	private long quantidadeRemessas;
	
	@JsonProperty("valorLancamentos")
	private double valorLancamentos;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	

	public TotalControleLancamento() {
	}

	/**
	 *
	 * @param valorLancamentos
	 * @param quantidadeRemessas
	 * @param quantidadeLancamentos
	 */
	public TotalControleLancamento(long quantidadeLancamentos, long quantidadeRemessas, double valorLancamentos) {
		super();
		this.quantidadeLancamentos = quantidadeLancamentos;
		this.quantidadeRemessas = quantidadeRemessas;
		this.valorLancamentos = valorLancamentos;
	}

	@JsonProperty("quantidadeLancamentos")
	public long getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}

	@JsonProperty("quantidadeLancamentos")
	public void setQuantidadeLancamentos(long quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}

	@JsonProperty("quantidadeRemessas")
	public long getQuantidadeRemessas() {
		return quantidadeRemessas;
	}

	@JsonProperty("quantidadeRemessas")
	public void setQuantidadeRemessas(long quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}

	@JsonProperty("valorLancamentos")
	public double getValorLancamentos() {
		return valorLancamentos;
	}

	@JsonProperty("valorLancamentos")
	public void setValorLancamentos(double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
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
