package br.com.cielo.repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cielo.dto.TbExtratoDTO;
import br.com.cielo.repository.impl.ItbExtratoRepository;

@Transactional
@Repository
public class TbExtratoRepository implements ItbExtratoRepository {

	private static final Logger log = LoggerFactory.getLogger(TbExtratoRepository.class);

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	Date date1 = null;
	Date date2 = null;

	@Override
	public void addTbExtrato(TbExtratoDTO tbExtratoDTO) throws Exception, Throwable {
		log.info("INICIANDO A GRAVAÇÃO DO EXTRATO - TbExtratoRepository");

		date1 = (java.util.Date) format.parse(tbExtratoDTO.getDataConfirmacao());
		date2 = (java.util.Date) format.parse(tbExtratoDTO.getDataLancamento());

		StringBuilder sql = new StringBuilder();

		sql.append("  INSERT INTO ");
		sql.append("  tb_extrato (");
		sql.append("  id, ");
		sql.append("  tb_extrato_dados_bancario, ");
		sql.append("  tb_extrato_data_confirmacao, ");
		sql.append("  tb_extrato_data_lancamento, ");
		sql.append("  tb_extrato_descricao, ");
		sql.append("  tb_extrato_numero, ");
		sql.append("  tb_extrato_situacao, ");
		sql.append("  tb_extrato_valorFinal) ");
		sql.append(
				"  values (:id, :tbExtratoDadosBancario, :tbExtratoDataConfirmacao, :tbExtratoDataLancamento, :tbExtratoDescricao, :tbExtratoNumero, :tbExtratoSituacao, :tbExtratoValorFinal)");

		SqlParameterSource params = new MapSqlParameterSource().addValue("id", tbExtratoDTO.getId())
				.addValue("tbExtratoDadosBancario", tbExtratoDTO.getDadosBancario())
				.addValue("tbExtratoDataConfirmacao", date1).addValue("tbExtratoDataLancamento", date2)
				.addValue("tbExtratoDescricao", tbExtratoDTO.getDescricao())
				.addValue("tbExtratoNumero", tbExtratoDTO.getNumero())
				.addValue("tbExtratoSituacao", tbExtratoDTO.getSituacao())
				.addValue("tbExtratoValorFinal", tbExtratoDTO.getValorFinal());

		try {
			jdbcTemplate.update(sql.toString(), params);
			log.info("GRAVANDO EXTRATO - TbExtratoRepository");
		} catch (Exception e) {
			log.error("ERRO AO GRAVAR O EXTRATO - TbExtratoRepository: ", e);
			
		}

	}

	final static StringBuilder sqlSelectPrincipal = new StringBuilder().append("  SELECT DISTINCT ").append("  id,")
			.append("  tb_extrato_dados_bancario, ").append("  tb_extrato_data_confirmacao, ")
			.append("  tb_extrato_data_lancamento, ").append("  tb_extrato_descricao, ").append("  tb_extrato_numero, ")
			.append("  tb_extrato_situacao, ").append("  tb_extrato_valorFinal ").append("  FROM tb_extrato ");

	private List<TbExtratoDTO> devolveListaObjetos(StringBuilder sql, SqlParameterSource params)
			throws Exception, Throwable {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {

			TbExtratoDTO tbExtratoDTO = new TbExtratoDTO();

			tbExtratoDTO.setId(rs.getLong("id"));
			tbExtratoDTO.setDadosBancario(rs.getString("tb_extrato_dados_bancario"));
			tbExtratoDTO.setDataConfirmacao(rs.getString("tb_extrato_data_confirmacao"));
			tbExtratoDTO.setDataLancamento(rs.getString("tb_extrato_data_lancamento"));
			tbExtratoDTO.setDescricao(rs.getString("tb_extrato_descricao"));
			tbExtratoDTO.setNumero(rs.getInt("tb_extrato_numero"));
			tbExtratoDTO.setSituacao(rs.getString("tb_extrato_situacao"));
			tbExtratoDTO.setValorFinal(rs.getBigDecimal("tb_extrato_valorFinal"));

			return tbExtratoDTO;
		});
	}

	@Override
	public List<TbExtratoDTO> getAll() throws Exception, Throwable {
		log.info("LISTANDO EXTRATO - TbExtratoRepository");
		StringBuilder sql = new StringBuilder(sqlSelectPrincipal).append(" order by tb_extrato_data_lancamento ");
		return devolveListaObjetos(sql, null);
	}

}
