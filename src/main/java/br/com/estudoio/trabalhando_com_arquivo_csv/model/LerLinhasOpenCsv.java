package br.com.estudoio.trabalhando_com_arquivo_csv.model;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class LerLinhasOpenCsv {

	public void lerCsv() throws IOException {
		
		
		String caminho = "C://Users//João Junior//Documents//CSV//pessoas.csv";
		String caminho2 = "C://Users//João Junior//Documents//CSV//pessoas2.csv";
		
		Reader reader = Files.newBufferedReader(Paths.get(caminho));
		CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build(); /*withSkipLines define o numero de linhas a serem puladas*/

		List<String[]> pessoas = csvReader.readAll();
		for (String[] pessoa : pessoas) {
			/*System.out.println("Name : " + pessoa[0] + " - Idade : " + pessoa[1] + " - Email : " + pessoa[2]);*/
			System.out.println(pessoa[0] + pessoa[1]);
		}
	}

}
