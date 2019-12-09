package br.com.cielo.service.impl;

import java.util.List;

import br.com.cielo.dto.TbExtratoDTO;






public interface ItbExtratoService {

	
	/**
	 * 
	 * @param tbExtratoDTO
	 * @throws Exception
	 * @throws Throwable
	 */
	void addTbExtrato(TbExtratoDTO tbExtratoDTO) throws Exception, Throwable;

	
	/**
	 * 
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	List<TbExtratoDTO> getAll() throws Exception, Throwable;
}
