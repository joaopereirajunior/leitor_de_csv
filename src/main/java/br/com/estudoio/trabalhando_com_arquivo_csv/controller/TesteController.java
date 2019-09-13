package br.com.estudoio.trabalhando_com_arquivo_csv.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudoio.trabalhando_com_arquivo_csv.model.LerArquivoCsv;
import br.com.estudoio.trabalhando_com_arquivo_csv.model.LerComPontoEVirgulaOpen;
import br.com.estudoio.trabalhando_com_arquivo_csv.model.LerLinhasOpenCsv;
import br.com.estudoio.trabalhando_com_arquivo_csv.model.ValidaUsuarioModel;

@RestController
public class TesteController {
	
	@RequestMapping("/arquivo")
	public String listarAlgo() throws IOException{
		
	LerLinhasOpenCsv lerLinha = new LerLinhasOpenCsv();
	
	lerLinha.lerCsv();
		
		return "Passou aqui o arquivo";
	}
	
	@GetMapping("/executa")
	public List<ValidaUsuarioModel> listarPontoEVirgula() throws IOException{
		
		LerArquivoCsv ler =new LerArquivoCsv();
		
		return ler.executaValidacao();
	}
	
	@RequestMapping("/executa2")
	public String validardados() throws IOException{
		
		LerLinhasOpenCsv ler = new LerLinhasOpenCsv();
		
		ler.lerCsv();
		
		return "Agora foii";
	}

}
