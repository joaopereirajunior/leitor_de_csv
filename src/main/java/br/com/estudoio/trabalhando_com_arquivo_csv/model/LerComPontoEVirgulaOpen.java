package br.com.estudoio.trabalhando_com_arquivo_csv.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class LerComPontoEVirgulaOpen {

	public void executa() throws IOException {
		String fileName = "C:\\Users\\João Junior\\Documents\\CSV\\Manutencao_Usuario_Lote_Com_Parceiro.csv";
		Path myPath = Paths.get(fileName);

		CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

		try (BufferedReader br = Files.newBufferedReader(myPath, StandardCharsets.UTF_8);
				CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser).build()) {

			List<String[]> rows = reader.readAll();

			for (String[] row : rows) {
				System.out.println("Aqui " + rows);
				for (String e : row) {
					System.out.format("%s ", e);
				}

				System.out.println();
			}
		}
	}

}
