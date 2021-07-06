package br.com.gerador.view;

import java.io.IOException;
import java.util.Scanner;

import br.com.gerador.controler.gerarNotaN1;
import br.com.gerador.controler.gerenciamentoDeIncidentes;

public class SubMain {

	public static void Subn1(String[] args) throws IOException {

		int option = 0;
		while (option == 0) {
			Scanner dusuario = new Scanner(System.in);
			System.out.println("|1 TRATAR REQUISIÇÃO DA URA -----(Linha, Ordem)------|");
			System.out.println("|2 SIMCARD EXPIRADO -------------(Numero do Simcard)-|");
			System.out.println("|3 PLANO NÃO PREVISTO -----------(Plano, Pacote, DDD)|");
			System.out.println("|0 VOLTAR -------------------------------------------|\r");

			int num = dusuario.nextInt();

			gerarNotaN1 gn1 = new gerarNotaN1();
			SubMain sm = new SubMain();
			AppMain ap = new AppMain();

			switch (num) {

			case 1:
				gn1.tratarURA();
				break;

			case 2:
				gn1.Expirado();
				break;

			case 3:
				gn1.NAOPREVISTO();
				break;
			case 0:
				ap.main(args);
				break;
			}
		}
	}
}
