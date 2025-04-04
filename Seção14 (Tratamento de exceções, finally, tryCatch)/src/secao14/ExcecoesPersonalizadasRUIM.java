package secao14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation2;

/*RUIM: método retornando string
 *A semântica da operação é prejudicada (retornar string n tem nada a ver com atualização de reserva)
 *Ainda não é possível tratar exceções em construtores
 *Ainda não há auxílio do compilador: o programador deve "lembrar" de verificar se houve erro
 *A lógica fica estruturada em condicionais aninhadas
 */

public class ExcecoesPersonalizadasRUIM {
	
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
			Reservation2 reservation2 = new Reservation2(number,checkIn,checkOut);
			System.out.println("Reserva: " + reservation2);
			
			System.out.println();
			System.out.print("Entre com a nova data para sua reserva: ");
			System.out.print("Dat de check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			String error = reservation2.updateDates(checkIn, checkOut);
			if(error != null) {
				System.out.println("Erro na reserva: " + error);
			}else {
				System.out.println("Reserva: " + reservation2);
			}
		}
		
		sc.close();
	}
}
