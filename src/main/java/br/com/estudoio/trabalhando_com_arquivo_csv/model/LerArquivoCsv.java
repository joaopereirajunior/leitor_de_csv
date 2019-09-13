package br.com.estudoio.trabalhando_com_arquivo_csv.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerArquivoCsv {

	private String caminhoArquivo = "C:\\Users\\João Junior\\Documents\\CSV\\Manutencao_Usuario_Lote_Com_Parceiro.csv";
	private String linha = "";
	private String separadorCampo = ";";
	public List<ValidaUsuarioModel> user = new ArrayList<>();

	public List<ValidaUsuarioModel> executaValidacao() throws IOException {

		BufferedReader carregarArq = null;

		/* try{ */
		carregarArq = new BufferedReader(new FileReader(caminhoArquivo));

		while ((linha = carregarArq.readLine()) != null) {
			
			
			String[] moeda = linha.split(separadorCampo);
			
			System.out.println(moeda[0] + " " + moeda[1] + " " + moeda[2] + " " + moeda[3] + " " + moeda[4] + " "
					+ moeda[5] + " " + moeda[6] + " " + moeda[7] + " " + moeda[8] + " " + moeda[9] + " " + moeda[10]
					+ " " + moeda[11] + " " + moeda[12] + " " + moeda[13]);
			
			ValidaUsuarioModel usuario = new ValidaUsuarioModel();
			List<ValidaUsuarioModel> usuarioLst = new ArrayList<>();
			
			usuario.setTipoAcao(moeda[0]);
			usuario.setMotivo(moeda[1]);
			usuario.setCpf(moeda[2]);
			usuario.setNome(moeda[3]);
			usuario.setFuncional(moeda[4]);
			usuario.setDdd(moeda[5]);
			usuario.setCelular(moeda[6]);
			usuario.setEmail(moeda[7]);
			usuario.setCargo(moeda[8]);
			usuario.setParceiro(moeda[9]);
			usuario.setLoja(moeda[10]);
			usuario.setJornadaSemana(moeda[11]);
			usuario.setJornadaFimSemana(moeda[12]);
			usuario.setItinerante(moeda[13]);
			
			user = usuarioLst;
			usuarioLst.add(usuario);
			System.out.println(usuarioLst.size());
			

			/*
			 * }catch (FileNotFoundException e) {
			 * System.out.println("Arquivo não encontrado"); // TODO: handle
			 * exception }
			 */

			for (ValidaUsuarioModel employee : usuarioLst) {
				System.out.println("Lista de usuário "+ usuarioLst.size());

			}

		}
		return user;
	}

}
