package br.com.apidata.main;

import java.time.Duration;
import java.time.LocalTime;

public class CalcularIntervaloHora {
	
	public static void main(String[] args) {
		
		//Hora atual
		LocalTime time = LocalTime.now();
		System.out.println("Hora atual: "+time);
		
		//Definindo hora com par�metro
		LocalTime timeOutro = LocalTime.of(23 , 11 ,10);
		System.out.println("Hora com par�metros: "+ timeOutro); 
		
		//Definindo hor�rio com par�metro
		LocalTime time2 = LocalTime.now().withHour(23).withMinute(11).withSecond(6);
		System.out.println("Hora com par�metro: " + time2);
		
		//Manipulando hor�rio
		LocalTime time4 = time2.plusHours(1).plusMinutes(45).plusSeconds(15);		
		System.out.println("Hora: "+time4.getHour() );
		System.out.println("Minuto: "+time4.getMinute() );
		System.out.println("Segundos: "+time4.getSecond() );
		System.out.println("Nanosegundo: "+time4.getNano() );
		
		//Calculando diferen�a entre horas
		Duration duration = Duration.between(time, time4);
		System.out.println("Diferen�a entre as horas: " + duration);
		
	}

}
