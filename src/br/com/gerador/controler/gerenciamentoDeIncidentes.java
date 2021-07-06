package br.com.gerador.controler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class gerenciamentoDeIncidentes {

	private static String caminhoArquivo = "C:\\linhas.txt";

	public void geraRemedy() throws FileNotFoundException, IOException {

		List<String> incidentes = LerArquivo.lerArquivoObjetos(caminhoArquivo);

		for (int i = 0; i < incidentes.size(); i++) {
			if (i == incidentes.size() - 1) {
				// System.out.println(incidentes.get(i).substring(0, 10));
				System.out.println("'ID do Incidente*+' = " + (char) 34 + incidentes.get(i) + "" + (char) 34 + "");
			} else {
				System.out.println("'ID do Incidente*+' = " + (char) 34 + incidentes.get(i) + "" + (char) 34 + " OR");
				// System.out.println(incidentes.get(i).substring(0, 10));
			}
		}

		System.out.println("\n\n\n");
	}

	public void geraJira() throws FileNotFoundException, IOException {

		List<String> incidentes = LerArquivo.lerArquivoObjetos(caminhoArquivo);

		for (int i = 0; i < incidentes.size(); i++) {
			if (i == 0) {
				System.out.println("(summary ~ " + (char) 34 + "R9-" + incidentes.get(i) + "*" + (char) 34 + " OR");
			} else if (i == incidentes.size() - 1) {
				System.out
						.println("summary ~ " + (char) 34 + "R9-" + incidentes.get(i) + "*\")and status != Resolvido");
			} else {
				System.out.println("summary ~ " + (char) 34 + "R9-" + incidentes.get(i) + "*" + (char) 34 + " OR");

			}
		}
		System.out.println("\n\n\n");
	}

	public void geraSkip() throws FileNotFoundException, IOException {

		List<String> incidentes = LerArquivo.lerArquivoObjetos(caminhoArquivo);


			
			for (int i = 0; i < incidentes.size(); i++) {
				for (String string : incidentes) {

					String[] result = string.split("_");
				if (i == incidentes.size() -1) {
					// <listOfOrders><orderActionId>3500301888A</orderActionId><stepToSkip>01</stepToSkip></listOfOrders>
					System.out.println("<listOfOrders><orderActionId>" + result[1] + "</orderActionId><stepToSkip>"
							+ result[0] + "</stepToSkip></listOfOrders>");
					
				} else {
					
					// System.out.println(incidentes.get(i).substring(0, 10));
				}
			}
			
		}
			System.out.println("\n\n\n");
	}
}
