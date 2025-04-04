package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoGlobalLocal {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); 
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //GMT Londres
		
		//retorna uma coleção de nomes dos fuso horários customizados
		for (String s: ZoneId.getAvailableZoneIds()){
			System.out.println(s);
		}
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //converte o Instant para uma data-hora local (fuso horário da máquina)
		LocalDateTime r2 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")); //usa o fuso horário de Portugal
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3); //1 hora adiantado em comparação a Londres
		
		//usa o get pra pegar um dia, mes, ano, etc em específico
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minutos = " + d05.getMinute());
		System.out.println("d05 segundos = " + d05.getSecond());
	}

}
