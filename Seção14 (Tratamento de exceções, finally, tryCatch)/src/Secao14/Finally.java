package Secao14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*É um bloco que contém código a ser executado independentemente de ter
ocorrido ou não uma exceção (finally), normalmente para fechar um arquivo, conexão de banco 
de dados, ou outro recurso específico*/

public class Finally {

	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt"); //para funcionar, basta criar um txt aqui com nome "in"
		Scanner sc = null;
		try {
			sc = new Scanner(file); //pode ler a partir de arquivos
			while (sc.hasNextLine()) { //percorre as linhas do arquivo
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) { //caso não encontre o arquivo
			System.out.println("Error opening file: " + e.getMessage());
		} finally { //independente dele dar certo ou não, o scanner é fechado e o arquivo também.
			if (sc != null) {
				sc.close();
			}
		}
	}
}