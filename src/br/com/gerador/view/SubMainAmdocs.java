package br.com.gerador.view;

import java.io.IOException;
import java.util.Scanner;

import br.com.gerador.controler.gerarNotaAmdocs;
import br.com.gerador.controler.gerarNotaN1;

public class SubMainAmdocs {

	public static void SubAmdocs(String[] args) throws IOException {

		int option = 0;
		while (option == 0) {
			Scanner dusuario = new Scanner(System.in);
			System.out.println("|1 ----Liberar IMSI -----------------|");
			System.out.println("|2 ----Receber Bilhete Portabilidade-|");
			System.out.println("|3 ----Liberação Dos Recursos -------|");
			System.out.println("|4 ----Criar Pedido Inventário ------|");
			System.out.println("|5 ----Notificar Faturamento --------|");
			System.out.println("|6 ----Request Ja Finalizada --------|");
			System.out.println("|7 ----Republicação 360  ------------|");
			System.out.println("|0 ----VOLTAR -----------------------|\r");

			int num = dusuario.nextInt();

			gerarNotaN1 gn1 = new gerarNotaN1();
			gerarNotaAmdocs gna = new gerarNotaAmdocs();
			SubMain sm = new SubMain();
			AppMain ap = new AppMain();

			switch (num) {

			case 1:
				gna.LiberarIMSI();
				break;

			case 2:
				gna.ReceberBilhetePortabilidade();
				break;

			case 3:
				gna.LiberacaoDosRecursos();
				break;

			case 4:
				gna.CriarPedidoInventario();
				break;

			case 5:
				gna.NotificarFaturamento();
				break;

			case 6:
				gna.EnvioOrdem();
				break;

			case 7:
				gna.Rep360();
				break;
			case 0:
				ap.main(args);
				break;

			}
		}
	}

}
