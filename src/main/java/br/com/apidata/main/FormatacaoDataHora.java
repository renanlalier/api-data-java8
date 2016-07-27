package br.com.apidata.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Classe para testar formata��o da nova API de data do Java 8
 * 
 * @author Renan Lalier
 * @since 26/07/2016
 * @version 1.0
 *
 */
public class FormatacaoDataHora {
	
	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Dia, m�s e ano (dd/MM/aaaa): " + format.format(dataAtual));
		//ou
		System.out.println("Dia, m�s e ano (dd/MM/aaaa): " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalDateTime dataAtual2 = LocalDateTime.now();
		DateTimeFormatter format2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("pt", "br"));
		System.out.println("Dia, m�s, ano e hor�rio (dd/MM/aaaa HH:mm): " + dataAtual2.format(format2));
		
		LocalDate dataAtual3 = LocalDate.now();
		DateTimeFormatter format3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("Dia da semana, m�s e ano: " + dataAtual3.format(format3));
		
		LocalDate dataAtual4 = LocalDate.now();
		System.out.println("Dia do m�s: " + dataAtual4.getDayOfMonth());
		System.out.println("Dia da semana: " + dataAtual4.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
		System.out.println("M�s: " + dataAtual4.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()));
		System.out.println("Ano: " + dataAtual4.getYear());
		
		LocalTime horarioDeEntrada = LocalTime.of(9, 0);
		System.out.println("Horario: " + horarioDeEntrada); 
		
		
	}

}
