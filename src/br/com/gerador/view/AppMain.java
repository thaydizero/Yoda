package br.com.gerador.view;

import java.io.IOException;
import java.time.format.TextStyle;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;

import br.com.gerador.controler.gerarNotaN1;
import br.com.gerador.controler.gerenciamentoDeIncidentes;

public class AppMain {
@SuppressWarnings("resource")


void tela () {
	
}
public static void main(String[] args) throws IOException {
	int option = 0;
	while (option == 0) {
	Scanner dusuario = new Scanner(System.in);

	System.out.println("\t\t\t\t\tEXECUTANDO O GERADOR DE QUERY YODA\n");
	System.out.println("ESCOLHA A OPÇÃO DESEJADA\n");
	System.out.println("( 1 )  QUERY REMEDY\n");
	System.out.println("( 2 )  QUERY JIRA\n");
//	System.out.println("|3------ NOTAS N1 -----------------|");
//	System.out.println("|4------ NOTAS AMDOCS--------------|");
//	System.out.println("|5------ NOTAS NGIN ---------------|");
	System.out.println("( 3 )  QUERY SKIP MASSIVO\n");
	System.out.println("( 0 )  Sair\n ");



	
	int num = dusuario.nextInt();
	
	gerenciamentoDeIncidentes gdi = new gerenciamentoDeIncidentes();
	gerarNotaN1 gn1 = new gerarNotaN1();
	SubMain sm = new SubMain();
	SubMainAmdocs sma = new SubMainAmdocs();
		
	switch (num) {

	
	case 1:
		gdi.geraRemedy();
		break;
	case 2:
		gdi.geraJira();
		break;
	case 3:
		gdi.geraSkip();
		break;
		
	case 4:
		sma.SubAmdocs(args);
		break;

	case 6:
		//notas n1
		sm.Subn1(args);
		break;
	case 0:
		System.exit(0);	
		break;

	default:
		System.out.println("\n\n Número Inválido\n\n");
	}
	}
}
}
