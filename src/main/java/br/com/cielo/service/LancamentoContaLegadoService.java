package br.com.cielo.service;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.cielo.dto.LancamentoContaLegado;
import br.com.cielo.dto.ListaControleLancamento;
import br.com.cielo.dto.TbExtratoDTO;
import br.com.cielo.service.impl.ILancamentoContaLegadoService;
import br.com.cielo.service.impl.ItbExtratoService;

@Service
public class LancamentoContaLegadoService implements ILancamentoContaLegadoService {

	private static final Logger log = LoggerFactory.getLogger(LancamentoContaLegadoService.class);

	@Autowired
	private ItbExtratoService extratoService;

	private List<ListaControleLancamento> listaControleLancamentos;

	private TbExtratoDTO tbExtratoDTO = new TbExtratoDTO();


	public void addLancamentoContaLegado(LancamentoContaLegado lancamentoContaLegado) throws Exception, Throwable {
		log.info("RECEBENDO REGISTRO PARA GERAR EXTRATO - TbExtratoRepository");

		listaControleLancamentos = lancamentoContaLegado.getListaControleLancamento();

		for (ListaControleLancamento listaControleLancamento : listaControleLancamentos) {

			tbExtratoDTO.setDadosBancario(listaControleLancamento.getNomeBanco() + "Ag.: " + listaControleLancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia() + " / CC.: " + listaControleLancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente() + listaControleLancamento.getValorLancamentoRemessa());
			tbExtratoDTO.setDataConfirmacao(listaControleLancamento.getDataEfetivaLancamento());
			tbExtratoDTO.setDataLancamento(listaControleLancamento.getDataLancamentoContaCorrenteCliente());
			tbExtratoDTO.setDescricao(listaControleLancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
			tbExtratoDTO.setNumero(Integer.valueOf(listaControleLancamento.getNumeroEvento()));
			tbExtratoDTO.setSituacao(listaControleLancamento.getLancamentoContaCorrenteCliente().getNomeTipoOperacao());
			tbExtratoDTO.setValorFinal(new BigDecimal(listaControleLancamento.getValorLancamentoRemessa()));

			this.extratoService.addTbExtrato(tbExtratoDTO);
		}

	}


	
}
