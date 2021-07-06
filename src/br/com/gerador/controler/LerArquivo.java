package br.com.gerador.controler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerArquivo {

	public static List<String> lerArquivoObjetos(String path) throws FileNotFoundException, IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		List<String> linhas = new ArrayList<String>();

		while (true) {
			String linha = buffRead.readLine();
			if (linha != null) {
				linhas.add(linha);
			} else
				break;
		}

		buffRead.close();
		return linhas;
	}
}