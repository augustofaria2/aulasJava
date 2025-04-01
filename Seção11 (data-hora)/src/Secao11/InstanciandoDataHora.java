package Secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataHora { //Z significa Zulu, timezone

	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); //data local da máquina, no meu caso, Brasil
		LocalDateTime d02 = LocalDateTime.now(); //data e hora local da máquina, no meu caso, Brasil
		Instant d03 = Instant.now(); //data e hora de acordo com o horario de Londres (GMT)
		
		//Londres é 3 horas adiantado em relação ao Brasil
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); //Passo a data com parse
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); //Diferente do padrão ISO
		LocalDate d08_2 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")); //apenas dia
		LocalDate d09 = LocalDate.parse("20/07/2022 01:30", fmt2); //dia e hora
		
		LocalDate d10 = LocalDate.of(2022, 7, 20); //pega separadamente e junta no formato ISO
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		
		System.out.println("d01 = " + d01); //não precisa de toString pq o java ja entende 
		System.out.println("d02 = " + d02); //que é string
		System.out.println("d03 = " + d03.toString()); //porém funciona igual
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06); //mostra a data e hora de Londres como 01:30:26
		System.out.println("d07 = " + d07); //pega o horário passado e mostra a hora em Londres
		System.out.println("d08 = " + d08);
		System.out.println("d08_2 = " + d08_2);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
	}

}
