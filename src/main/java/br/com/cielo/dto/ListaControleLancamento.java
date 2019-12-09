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
@JsonPropertyOrder({ 
	"lancamentoContaCorrenteCliente", 
	"dataEfetivaLancamento", 
	"dataLancamentoContaCorrenteCliente",
	"numeroEvento", 
	"descricaoGrupoPagamento", 
	"codigoIdentificadorUnico", 
	"nomeBanco",
	"quantidadeLancamentoRemessa", 
	"numeroRaizCNPJ", 
	"numeroSufixoCNPJ", 
	"valorLancamentoRemessa",
	"dateLancamentoContaCorrenteCliente", 
	"dateEfetivaLancamento" })
public class ListaControleLancamento {

	@JsonProperty("lancamentoContaCorrenteCliente")
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	
	@JsonProperty("dataEfetivaLancamento")
	private String dataEfetivaLancamento;
	
	@JsonProperty("dataLancamentoContaCorrenteCliente")
	private String dataLancamentoContaCorrenteCliente;
	
	@JsonProperty("numeroEvento")
	private String numeroEvento;
	
	@JsonProperty("descricaoGrupoPagamento")
	private String descricaoGrupoPagamento;
	
	@JsonProperty("codigoIdentificadorUnico")
	private String codigoIdentificadorUnico;
	
	@JsonProperty("nomeBanco")
	private String nomeBanco;
	
	@JsonProperty("quantidadeLancamentoRemessa")
	private long quantidadeLancamentoRemessa;
	
	@JsonProperty("numeroRaizCNPJ")
	private String numeroRaizCNPJ;
	
	@JsonProperty("numeroSufixoCNPJ")
	private String numeroSufixoCNPJ;
	
	@JsonProperty("valorLancamentoRemessa")
	private long valorLancamentoRemessa;
	
	@JsonProperty("dateLancamentoContaCorrenteCliente")
	private long dateLancamentoContaCorrenteCliente;
	
	@JsonProperty("dateEfetivaLancamento")
	private long dateEfetivaLancamento;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	

	public ListaControleLancamento() {
	}

	/**
	 *
	 * @param dateLancamentoContaCorrenteCliente
	 * @param numeroSufixoCNPJ
	 * @param quantidadeLancamentoRemessa
	 * @param numeroRaizCNPJ
	 * @param valorLancamentoRemessa
	 * @param dataLancamentoContaCorrenteCliente
	 * @param dataEfetivaLancamento
	 * @param numeroEvento
	 * @param nomeBanco
	 * @param lancamentoContaCorrenteCliente
	 * @param descricaoGrupoPagamento
	 * @param codigoIdentificadorUnico
	 * @param dateEfetivaLancamento
	 */
	public ListaControleLancamento(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente,
			String dataEfetivaLancamento, 
			String dataLancamentoContaCorrenteCliente, 
			String numeroEvento,
			String descricaoGrupoPagamento, 
			String codigoIdentificadorUnico, 
			String nomeBanco,
			long quantidadeLancamentoRemessa, 
			String numeroRaizCNPJ, 
			String numeroSufixoCNPJ,
			long valorLancamentoRemessa, 
			long dateLancamentoContaCorrenteCliente, 
			long dateEfetivaLancamento) {
		super();
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
		this.dataEfetivaLancamento = dataEfetivaLancamento;
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
		this.numeroEvento = numeroEvento;
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
		this.nomeBanco = nomeBanco;
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
		this.numeroRaizCNPJ = numeroRaizCNPJ;
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
		this.valorLancamentoRemessa = valorLancamentoRemessa;
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	@JsonProperty("lancamentoContaCorrenteCliente")
	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	@JsonProperty("lancamentoContaCorrenteCliente")
	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

	@JsonProperty("dataEfetivaLancamento")
	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	@JsonProperty("dataEfetivaLancamento")
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	@JsonProperty("dataLancamentoContaCorrenteCliente")
	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	@JsonProperty("dataLancamentoContaCorrenteCliente")
	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	@JsonProperty("numeroEvento")
	public String getNumeroEvento() {
		return numeroEvento;
	}

	@JsonProperty("numeroEvento")
	public void setNumeroEvento(String numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	@JsonProperty("descricaoGrupoPagamento")
	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	@JsonProperty("descricaoGrupoPagamento")
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	@JsonProperty("codigoIdentificadorUnico")
	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	@JsonProperty("codigoIdentificadorUnico")
	public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	@JsonProperty("nomeBanco")
	public String getNomeBanco() {
		return nomeBanco;
	}

	@JsonProperty("nomeBanco")
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	@JsonProperty("quantidadeLancamentoRemessa")
	public long getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	@JsonProperty("quantidadeLancamentoRemessa")
	public void setQuantidadeLancamentoRemessa(long quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	@JsonProperty("numeroRaizCNPJ")
	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	@JsonProperty("numeroRaizCNPJ")
	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	@JsonProperty("numeroSufixoCNPJ")
	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	@JsonProperty("numeroSufixoCNPJ")
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	@JsonProperty("valorLancamentoRemessa")
	public long getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	@JsonProperty("valorLancamentoRemessa")
	public void setValorLancamentoRemessa(long valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	@JsonProperty("dateLancamentoContaCorrenteCliente")
	public long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	@JsonProperty("dateLancamentoContaCorrenteCliente")
	public void setDateLancamentoContaCorrenteCliente(long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	@JsonProperty("dateEfetivaLancamento")
	public long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	@JsonProperty("dateEfetivaLancamento")
	public void setDateEfetivaLancamento(long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
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