package br.com.estudoio.trabalhando_com_arquivo_csv.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudoio.trabalhando_com_arquivo_csv.model.LerLinhasOpenCsv;

@RestController
public class TesteController {
	
	@RequestMapping("/arquivo")
	public String listarAlgo() throws IOException{
		
	LerLinhasOpenCsv lerLinha = new LerLinhasOpenCsv();
	
	lerLinha.lerCsv();
		
		return "Passou aqui o arquivo";
	}

}
