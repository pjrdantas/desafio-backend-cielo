package br.com.cielo.repository.impl;

import java.util.List;

import br.com.cielo.dto.TbExtratoDTO;

public interface ItbExtratoRepository {

	
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
