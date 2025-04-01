package Secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; //permite operações com expressões lambda

/*
 * Lista é uma estrutura de dados: homogênea (dados do mesmo tipo), ordenada (elementos acessados 
 * por meio de posições), inicia vazia, e seus elementos são alocados sob demanda e
 * cada elemento ocupa um "nó" (ou nodo) da lista.
 * 
 * Tipo (interface): List (não pode ser instanciada com new, deve ser implementada por uma classe
 * que implementa a interface list).
 * Classes que implementam: ArrayList, LinkedList, etc.
 * 
 * Vantagens: tamanho variável e facilidade para se realizar inserções e deleções.
 * Desvantagens: acesso sequencial aos elementos (porém tem soluções para melhorar isso).
 * 
 * Comandos: 
 * 
 * Tamanho da lista: size()
 * Obter o elemento de uma posição: get(position)
 * Inserir elemento na lista: add(obj), add(int, obj)
 * Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
 * Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
 * 
 * Filtrar lista com base em predicado:
 * List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
 * 
 * Encontrar primeira ocorrência com base em predicado:
 * Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
 */

public class Lista {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		//list.remove(1) remove o primeiro elemento da lista, no caso o alex
		//list.remove("maria") remove a maria da lista
		list.removeIf(x -> x.charAt(0) == 'M'); /*função lambda do tipo predicado, remove todo 
												  mundo cujo primeiro caractere é M*/
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); //mostra a posição de bob na lista
		System.out.println("Index of Marco: " + list.indexOf("Marco")); //mostra -1 porque não tem marco na lista
		System.out.println("---------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		//gera uma lista com somente os que tem os nome começados com A
		//basicamente converte a lista para stream, operação lambda e depois reconverte para lista
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		//retorna o primeiro elemento em que ocorre a operação lambda, caso não exista, retorna nulo
		System.out.println(name);
	
	}

}
