package com.devsuperior.javacompleto.aula160.model.entities;

/**
 * 
 * @author Marlene
 * SE��O 15: Tratamento de Exce��es
 * AULA 160. Criando exce��es personalizadas
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private int roomNumber;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() { }

	public Reservation(int roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public long duration() {
		long diff = checkout.getTime() - checkin.getTime(); //diferen�a no tipo long em milissegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //Classe que converte Milisegundos em dias
	}
	
	public void updateDates(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Room " + roomNumber 
				+ ", check-in: " + sdf.format(checkin) 
				+ ", check-out: " +  sdf.format(checkout)
				+ ", " + duration() + " nights";
	}
	
}
