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
	"totalControleLancamento", 
	"listaControleLancamento", 
	"indice", 
	"tamanhoPagina", 
	"totalElements" })
public class LancamentoContaLegado {

	@JsonProperty("totalControleLancamento")
	private TotalControleLancamento totalControleLancamento;
	
	@JsonProperty("listaControleLancamento")
	private List<ListaControleLancamento> listaControleLancamento = null;
	
	@JsonProperty("indice")
	private long indice;
	
	@JsonProperty("tamanhoPagina")
	private long tamanhoPagina;
	
	@JsonProperty("totalElements")
	private long totalElements;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();



	public LancamentoContaLegado() {
	}

	/**
	 *
	 * @param totalControleLancamento
	 * @param indice
	 * @param tamanhoPagina
	 * @param listaControleLancamento
	 * @param totalElements
	 */
	public LancamentoContaLegado(
			TotalControleLancamento totalControleLancamento,
			List<ListaControleLancamento> listaControleLancamento, 
			long indice, 
			long tamanhoPagina,
			long totalElements) {
		super();
		this.totalControleLancamento = totalControleLancamento;
		this.listaControleLancamento = listaControleLancamento;
		this.indice = indice;
		this.tamanhoPagina = tamanhoPagina;
		this.totalElements = totalElements;
	}

	@JsonProperty("totalControleLancamento")
	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}

	@JsonProperty("totalControleLancamento")
	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}

	@JsonProperty("listaControleLancamento")
	public List<ListaControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}

	@JsonProperty("listaControleLancamento")
	public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}

	@JsonProperty("indice")
	public long getIndice() {
		return indice;
	}

	@JsonProperty("indice")
	public void setIndice(long indice) {
		this.indice = indice;
	}

	@JsonProperty("tamanhoPagina")
	public long getTamanhoPagina() {
		return tamanhoPagina;
	}

	@JsonProperty("tamanhoPagina")
	public void setTamanhoPagina(long tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}

	@JsonProperty("totalElements")
	public long getTotalElements() {
		return totalElements;
	}

	@JsonProperty("totalElements")
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
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