package Secao14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

/*Ou vc trata a exceção no método que chamou ela (try,catch), ou
 *vc propaga a exceção (throws nomeExceção) para o próximo método
 *formando uma pilha de exceções.
 *
 *MUITO RUIM: lógica de validação no programa principal.
 *(lógica de validação não delegada à reserva).
 */

public class ExcecoesPersonalizadasMUITORUIM {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Numero do quarto: ");
		int number = sc.nextInt();
		System.out.print("Dat de check-in (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data de check-out (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: data de check-out deve ser posterior a de check-in");
		}else {
			Reservation reservation = new Reservation(number,checkIn,checkOut);
			System.out.println("Reserva: " + reservation);
			
			System.out.println();
			System.out.print("Entre com a nova data para sua reserva: ");
			System.out.print("Dat de check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			if(checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Erro na reserva: Datas de reserva devem ser futuras");
			}else if(!checkOut.after(checkIn)) {
				System.out.println("Erro na reserva: data de check-out deve ser posterior a de check-in");
			}else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reserva: " + reservation);
			}
		}
		
		sc.close();
	}
}
