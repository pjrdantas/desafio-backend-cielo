package br.com.cielo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the tb_extrato database table.
 * 
 */
@Entity
@Table(name="tb_extrato")
public class TbExtratoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="tb_extrato_dados_bancario", nullable=false, length=100)
	private String tbExtratoDadosBancario;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_extrato_data_confirmacao", nullable=false)
	private Date tbExtratoDataConfirmacao;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_extrato_data_lancamento", nullable=false)
	private Date tbExtratoDataLancamento;

	@Column(name="tb_extrato_descricao", nullable=false, length=45)
	private String tbExtratoDescricao;

	@Column(name="tb_extrato_numero", nullable=false)
	private Long tbExtratoNumero;

	@Column(name="tb_extrato_situacao", nullable=false, length=45)
	private String tbExtratoSituacao;


	@Column(name="tb_extrato_valorFinal", nullable=false, precision=10, scale=2)
	private BigDecimal tbExtratoValorFinal;

	public TbExtratoEntity() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the tbExtratoDadosBancario
	 */
	public String getTbExtratoDadosBancario() {
		return tbExtratoDadosBancario;
	}

	/**
	 * @param tbExtratoDadosBancario the tbExtratoDadosBancario to set
	 */
	public void setTbExtratoDadosBancario(String tbExtratoDadosBancario) {
		this.tbExtratoDadosBancario = tbExtratoDadosBancario;
	}

	/**
	 * @return the tbExtratoDataConfirmacao
	 */
	public Date getTbExtratoDataConfirmacao() {
		return tbExtratoDataConfirmacao;
	}

	/**
	 * @param tbExtratoDataConfirmacao the tbExtratoDataConfirmacao to set
	 */
	public void setTbExtratoDataConfirmacao(Date tbExtratoDataConfirmacao) {
		this.tbExtratoDataConfirmacao = tbExtratoDataConfirmacao;
	}

	/**
	 * @return the tbExtratoDataLancamento
	 */
	public Date getTbExtratoDataLancamento() {
		return tbExtratoDataLancamento;
	}

	/**
	 * @param tbExtratoDataLancamento the tbExtratoDataLancamento to set
	 */
	public void setTbExtratoDataLancamento(Date tbExtratoDataLancamento) {
		this.tbExtratoDataLancamento = tbExtratoDataLancamento;
	}

	/**
	 * @return the tbExtratoDescricao
	 */
	public String getTbExtratoDescricao() {
		return tbExtratoDescricao;
	}

	/**
	 * @param tbExtratoDescricao the tbExtratoDescricao to set
	 */
	public void setTbExtratoDescricao(String tbExtratoDescricao) {
		this.tbExtratoDescricao = tbExtratoDescricao;
	}

	/**
	 * @return the tbExtratoNumero
	 */
	public Long getTbExtratoNumero() {
		return tbExtratoNumero;
	}

	/**
	 * @param tbExtratoNumero the tbExtratoNumero to set
	 */
	public void setTbExtratoNumero(Long tbExtratoNumero) {
		this.tbExtratoNumero = tbExtratoNumero;
	}

	/**
	 * @return the tbExtratoSituacao
	 */
	public String getTbExtratoSituacao() {
		return tbExtratoSituacao;
	}

	/**
	 * @param tbExtratoSituacao the tbExtratoSituacao to set
	 */
	public void setTbExtratoSituacao(String tbExtratoSituacao) {
		this.tbExtratoSituacao = tbExtratoSituacao;
	}

	/**
	 * @return the tbExtratoValorFinal
	 */
	public BigDecimal getTbExtratoValorFinal() {
		return tbExtratoValorFinal;
	}

	/**
	 * @param tbExtratoValorFinal the tbExtratoValorFinal to set
	 */
	public void setTbExtratoValorFinal(BigDecimal tbExtratoValorFinal) {
		this.tbExtratoValorFinal = tbExtratoValorFinal;
	}

	
	
}