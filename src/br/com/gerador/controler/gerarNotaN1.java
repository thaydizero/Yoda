package br.com.gerador.controler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import br.com.gerador.beans.Dados;

public class gerarNotaN1 {

	public void tratarURA() throws IOException {
		Dados dado = new Dados();
		BufferedReader br = new BufferedReader(new FileReader("C:\\linhas.txt"));
		String linha;
		while ((linha = br.readLine()) != null) {
			String[] lin = linha.split(",");
			dado.setLinha(lin[0]);
			dado.setOrdem(lin[1]);
			System.out.println("[BRQ APROVISIONAMENTO VIVO NEXT N2]N1, linha " + lin[0] + " da ordem " + lin[1]
					+ " esta parada na atividade 'Tratar Requisi��o da URA'. O Aprovisionamento Vivo Next N2 n�o tem mais a��o'\n");
		}
		br.close();

	}

	public void Expirado() throws IOException {
		Dados dado = new Dados();
		BufferedReader br = new BufferedReader(new FileReader("C:\\linhas.txt"));
		String linha;
		while ((linha = br.readLine()) != null) {
			String[] lin = linha.split(",");
			dado.setLinha(lin[0]);
			System.out.println("[BRQ APROVISIONAMENTO VIVO NEXT N2]N1, SIMCARD " + lin[0] + " est� expirado. Necess�rio cancelamento da ordem, e a troca do simcard.\n");
		}
		br.close();
	}
	
	public void NAOPREVISTO() throws IOException {
		Dados dado = new Dados();
		BufferedReader br = new BufferedReader(new FileReader("C:\\linhas.txt"));
		String linha;
		while ((linha = br.readLine()) != null) {
			String[] lin = linha.split(",");
			dado.setOrdem(lin[0]);//Ordem
			dado.setPacote(lin[1]);//Pacote
			dado.setPasso(lin[2]);//DDD
			System.out.println("[BRQ APROVISIONAMENTO VIVO NEXT N2]N1, ordem " + lin[0]+ " ativa plano " + lin[1]+ " n�o previsto para �rea " +lin[2] +". Necess�rio o cancelamento da ordem. att\n");
		}
		br.close();
	}
}