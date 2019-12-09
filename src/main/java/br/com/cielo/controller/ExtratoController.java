package br.com.cielo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.dto.TbExtratoDTO;
import br.com.cielo.service.impl.ItbExtratoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/service")
public class ExtratoController {

	private static final Logger log = LoggerFactory.getLogger(ExtratoController.class);

	@Autowired
	private ItbExtratoService extratoService;

	

	/**
	 * 
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value = "/extrato", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<TbExtratoDTO> consultar() throws Exception, Throwable {
		log.info("PREPARANDO EXTRATO - ExtratoController");
		return this.extratoService.getAll();
	}

}
