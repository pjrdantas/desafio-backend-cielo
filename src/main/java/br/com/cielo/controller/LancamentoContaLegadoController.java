package br.com.cielo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.dto.LancamentoContaLegado;
import br.com.cielo.response.ResponseModel;
import br.com.cielo.service.impl.ILancamentoContaLegadoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/service")
public class LancamentoContaLegadoController {

	private static final Logger log = LoggerFactory.getLogger(LancamentoContaLegadoController.class);

	@Autowired
	private ILancamentoContaLegadoService lancamentoContaLegadoService;

	
	
	/**
	 * 
	 * @param lancamentoContaLegado
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value = "/lancamentoContaLegado", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel salvar(@RequestBody LancamentoContaLegado lancamentoContaLegado) throws Exception, Throwable {
		
		log.info("RECEBENDO O LANÇAMENTO CONTA LEGADO - LancamentoContaLegadoController");

		try {
			this.lancamentoContaLegadoService.addLancamentoContaLegado(lancamentoContaLegado);
			return new ResponseModel(1, "REGISTRO RECEBIDO COM SUCESSO");
		} catch (Exception e) {
			log.error("OCORREU UM ERRO AO TENTAR GRAVAR UM REGISTRO" + e.getMessage());
			return new ResponseModel(0, e.getMessage());
		}
	}
}
