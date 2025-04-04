package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoDataHora {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); 
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //Em Londres
		//especificar sempre o fuso horário no ofPattern pra Instant
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //pega o fuso horário da máquina
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; //por padrão usa o UTC
		
		System.out.println("d04 = " + d04.format(fmt1)); //Muda para o formato passado
		System.out.println("d04 = " + fmt1.format(d04)); //funciona igual
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //funciona igual
	
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4)); //Padrão ISO data-hora
	 
		
		//Vai mostrar a hora 3 horas atrasada ao que foi passado antes, porque usa o fuso do Brasil (da máquina)
		System.out.println("d06 = " + fmt3.format(d06)); //Instant só funciona assim
		System.out.println("d06 = " + fmt5.format(d06)); //Com Z no final indicando fuso horário
		System.out.println("d06 = " + d06.toString()); //Com toString também mostra
	}

}
