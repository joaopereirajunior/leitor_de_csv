package br.com.estudoio.trabalhando_com_arquivo_csv.model;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class LerLinhasOpenCsv {

	public void lerCsv() throws IOException {
		String fileName = "C:\\Users\\João Junior\\Documents\\CSV\\Manutencao_Usuario_Lote_Com_Parceiro.csv";
		Path myPath = Paths.get(fileName);
		
		
		String caminho = "C:\\Users\\João Junior\\Documents\\CSV\\pessoas.csv";
		
		CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
		
		Reader reader = Files.newBufferedReader(Paths.get(caminho));
		CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).withCSVParser(parser).build(); /*withSkipLines define o numero de linhas a serem puladas*/

		List<String[]> pessoas = csvReader.readAll();
		for (String[] pessoa : pessoas) {
			/*System.out.println("Name : " + pessoa[0] + " - Idade : " + pessoa[1] + " - Email : " + pessoa[2]);*/
			System.out.println(pessoa[0]+" " + pessoa[1]+" "+pessoa[2]+" " +pessoa[3]+" " +pessoa[4]+" " +pessoa[5]+" " +pessoa[6]+" " +pessoa[7]+" " +pessoa[8]+" " +
					pessoa[9]+" " +pessoa[10]+" " +pessoa[11]+" " +pessoa[12]+" " +pessoa[13]);
		}
	}

}
