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
@JsonPropertyOrder({ "codigoBanco", "numeroAgencia", "numeroContaCorrente" })
public class DadosDomicilioBancario {

	@JsonProperty("codigoBanco")
	private long codigoBanco;
	
	@JsonProperty("numeroAgencia")
	private long numeroAgencia;
	
	@JsonProperty("numeroContaCorrente")
	private String numeroContaCorrente;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	

	public DadosDomicilioBancario() {
	}

	/**
	 *
	 * @param numeroContaCorrente
	 * @param codigoBanco
	 * @param numeroAgencia
	 */
	public DadosDomicilioBancario(long codigoBanco, long numeroAgencia, String numeroContaCorrente) {
		super();
		this.codigoBanco = codigoBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroContaCorrente = numeroContaCorrente;
	}

	@JsonProperty("codigoBanco")
	public long getCodigoBanco() {
		return codigoBanco;
	}

	@JsonProperty("codigoBanco")
	public void setCodigoBanco(long codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	@JsonProperty("numeroAgencia")
	public long getNumeroAgencia() {
		return numeroAgencia;
	}

	@JsonProperty("numeroAgencia")
	public void setNumeroAgencia(long numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	@JsonProperty("numeroContaCorrente")
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	@JsonProperty("numeroContaCorrente")
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
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