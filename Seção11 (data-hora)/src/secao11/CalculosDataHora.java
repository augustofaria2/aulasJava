package secao11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); 
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7); //menos 7 dias no d04
		LocalDate nextWeekLocalDate = d04.plusDays(7); //mais 7 dias no d04
		LocalDate nextYearLocalDate = d04.plusYears(7); //mais 7 anos no d04
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		System.out.println(nextYearLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		LocalDateTime nextYearLocalDateTime = d05.plusYears(7);
		
		//como é localdatetime da pra somar e diminuir horas, minutos, segundos, milisegundos
		
		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextWeekLocalDateTime);
		System.out.println(nextYearLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		Instant nextYearInstant = d06.plus(7, ChronoUnit.YEARS);
		
		/*como é instant, usamos uma passagem de parâmetros contendo o ChronoUnit
		 *e qual unidade queremos (segundos, minutos, dias, meses, anos, decadas, séculos)
		 */
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		System.out.println(nextYearInstant);
		
		/*duration é pra calcular a diferença entre 2 data-hora, porém se for LocalDate, tem que
		 *converter pra LocalDateTime com o .atTime(0, 0) ou um valor que queiramos passar para
		 *horas e minutos / atStartofDay() que também funciona igual
		 */
		
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(nextYearInstant, d06);
		Duration t4 = Duration.between(d06, nextYearInstant);
		
		System.out.println(t1.toDays());
		System.out.println(t2.toDays()); //podemos escolher se quer que aparece em dias, meses, anos, etc
		System.out.println(t3.toDays());
		System.out.println(t4.toDays()); 
		//calcula o inverso também, gerando valor negativo quando a primeira data é posterior a segunda
	}

}
