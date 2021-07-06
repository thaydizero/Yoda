package br.com.gerador.controler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import br.com.gerador.beans.Dados;

public class gerarNotaAmdocs {

	public void LiberarIMSI() throws IOException {
		Dados dado = new Dados();
		BufferedReader br = new BufferedReader(new FileReader("C:\\linhas.txt"));
		String linha;
		while ((linha = br.readLine()) != null) {
			String[] lin = linha.split(" ");
			dado.setOrdem(lin[0]);
			System.out.println("[BRQ APROVISIONAMENTO VIVO NEXT N2]AMDOCS, ordem " + lin[0]
					+ " esta parada na atividade 'Liberar IMSI' poderiam coletar o log e encaminhar suporte m�vel? O Aprovisionamento n�o tem a��o att.\n");
		}
		br.close();
	}

	public void ReceberBilhetePortabilidade() throws IOException {
		Dados dado = new Dados();
		BufferedReader br = new BufferedReader(new FileReader("C:\\linhas.txt"));
		String linha;
		while ((linha = br.readLine()) != null) {
			String[] lin = linha.split(" ");
			dado.setOrdem(lin[0]);
			System.out.println("[BRQ APROVISIONAMENTO VIVO NEXT N2]AMDOCS, ordem " + lin[0]
					+ " esta parada na atividade 'Receber Bilhete de Portabilidade' poderiam coletar o log e encaminhar suporte m�vel? O Aprovisionamento n�o tem a��o att.\n");
		}
		br.close();
	}

	public void LiberacaoDosRecursos() throws IOException {
		Dados dado = new Dados();
		BufferedReader br = new BufferedReader(new FileReader("C:\\linhas.txt"));
		String linha;
		while ((linha = br.readLine()) != null) {
			String[] lin = linha.split(" ");
			dado.setOrdem(lin[0]);
			System.out.println("[BRQ APROVISIONAMENTO VIVO NEXT N2]AMDOCS, ordem " + lin[0]
					+ " esta parada na atividade 'Libera��o dos Recursos' poderiam coletar o log e encaminhar suporte m�vel? O Aprovisionamento n�o tem a��o att.\n");
		}
		br.close();
	}

	public void CriarPedidoInventario() throws IOException {
		Dados dado = new Dados();
		BufferedReader br = new BufferedReader(new FileReader("C:\\linhas.txt"));
		String linha;
		while ((linha = br.readLine()) != null) {
			String[] lin = linha.split(" ");
			dado.setOrdem(lin[0]);
			System.out.println("[BRQ APROVISIONAMENTO VIVO NEXT N2]AMDOCS, ordem " + lin[0]
					+ " esta parada na atividade 'Criar Pedido no Invent�rio' poderiam coletar o log e encaminhar suporte m�vel? O Aprovisionamento n�o tem a��o att.\n");
		}
		br.close();
	}

	public void NotificarFaturamento() throws IOException {
		Dados dado = new Dados();
		BufferedReader br = new BufferedReader(new FileReader("C:\\linhas.txt"));
		String linha;
		while ((linha = br.readLine()) != null) {
			String[] lin = linha.split(" ");
			dado.setOrdem(lin[0]);
			System.out.println("[BRQ APROVISIONAMENTO VIVO NEXT N2]AMDOCS, ordem " + lin[0]
					+ " Request j� finalizada ou n�o existente para os par�metros informados, podem verificar? att\n");
		}
		br.close();
	}

	public void EnvioOrdem() throws IOException {
		Dados dado = new Dados();
		BufferedReader br = new BufferedReader(new FileReader("C:\\linhas.txt"));
		String linha;
		while ((linha = br.readLine()) != null) {
			String[] lin = linha.split(" ");
			dado.setOrdem(lin[0]);
			System.out.println("[BRQ APROVISIONAMENTO VIVO NEXT N2]AMDOCS, ordem " + lin[0]
					+ " esta parada na atividade 'Notificar Faturamento' poderiam coletar o log e encaminhar suporte m�vel? O Aprovisionamento n�o tem a��o att.\n");
		}
		br.close();
	}

	public void Rep360() throws IOException {
		Dados dado = new Dados();
		BufferedReader br = new BufferedReader(new FileReader("C:\\linhas.txt"));
		String linha;
		while ((linha = br.readLine()) != null) {
			String[] lin = linha.split(" ");
			dado.setLinha(lin[0]);
			System.out.println("[BRQ APROVISIONAMENTO VIVO NEXT N2]AMDOCS, poderiam efetuar a republica��o da linha " + lin[0] + "no 360. att \n");
		}
		br.close();
	}
}
