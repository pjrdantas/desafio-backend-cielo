package br.com.cielo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.dto.TbExtratoDTO;
import br.com.cielo.repository.impl.ItbExtratoRepository;
import br.com.cielo.service.impl.ItbExtratoService;


@Service
public class TbExtratoService implements ItbExtratoService {

	private static final Logger log = LoggerFactory.getLogger(TbExtratoService.class);

	
	@Autowired
	private ItbExtratoRepository tbExtratoRepository;
	
	
	@Override
	public void addTbExtrato(TbExtratoDTO tbExtratoDTO) throws Exception, Throwable {
		log.info("PREPARANDO REGISTRO DE EXTRATO - TbExtratoService");
		tbExtratoRepository.addTbExtrato(tbExtratoDTO);	
	}

	
	@Override
	public List<TbExtratoDTO> getAll()   throws Exception, Throwable {
		log.info("RETORNANDO O EXTRATO - TbExtratoService");		
		return tbExtratoRepository.getAll();		
	}
	


}
