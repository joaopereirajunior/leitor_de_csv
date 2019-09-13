package br.com.estudoio.trabalhando_com_arquivo_csv.model;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class LerSeparadoPontoEvirgula {
	
	public void readLinhaLinha() throws IOException{
		@Deprecated
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\João Junior\\Documents\\CSV\\pessoas2.csv"), ';');

		List<Employee> emps = new ArrayList<Employee>();

		List<String[]> records = reader.readAll();

		Iterator<String[]> iterator = records.iterator();

		while (iterator.hasNext()) {
			String[] record = iterator.next();
			Employee emp = new Employee();
			emp.setId(record[0]);
			emp.setName(record[1]);
			emp.setAge(record[2]);
			emp.setCountry(record[3]);
			emps.add(emp);
		}

		System.out.println(emps);

		reader.close();
		
	}

}
