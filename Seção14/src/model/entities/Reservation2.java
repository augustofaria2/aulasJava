package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation2 {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation2(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long dif = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(dif,TimeUnit.MILLISECONDS);
	}
	
	public String updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			return "Erro na reserva: Datas de reserva devem ser futuras";
		} 
		if(!checkOut.after(checkIn)) {
			return "Erro na reserva: data de check-out deve ser posterior a de check-in";
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		return null; //caso não ocorra nenhum erro
	}
	
	@Override
	public String toString() {
		return "Room"
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ duration()
				+ " nights.";
	}
}