package br.com.apidata.main;

import java.time.Duration;
import java.time.LocalTime;

public class CalcularIntervaloHora {
	
	public static void main(String[] args) {
		
		//Hora atual
		LocalTime time = LocalTime.now();
		System.out.println("Hora atual: "+time);
		
		//Definindo hora com parâmetro
		LocalTime timeOutro = LocalTime.of(23 , 11 ,10);
		System.out.println("Hora com parâmetros: "+ timeOutro); 
		
		//Definindo horário com parâmetro
		LocalTime time2 = LocalTime.now().withHour(23).withMinute(11).withSecond(6);
		System.out.println("Hora com parâmetro: " + time2);
		
		//Manipulando horário
		LocalTime time4 = time2.plusHours(1).plusMinutes(45).plusSeconds(15);		
		System.out.println("Hora: "+time4.getHour() );
		System.out.println("Minuto: "+time4.getMinute() );
		System.out.println("Segundos: "+time4.getSecond() );
		System.out.println("Nanosegundo: "+time4.getNano() );
		
		//Calculando diferença entre horas
		Duration duration = Duration.between(time, time4);
		System.out.println("Diferença entre as horas: " + duration);
		
	}

}
