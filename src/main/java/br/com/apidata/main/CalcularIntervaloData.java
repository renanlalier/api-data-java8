package br.com.apidata.main;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * 
 * Classe responsável por exemplificar o calculo de intervalo de data com a API Java 8
 * @author Renan Lalier
 * @since 26/07/2016
 *
 */
public class CalcularIntervaloData {
	
	public static void main(String[] args) {
		
		//Adicionando dias em uma data
		LocalDate dataAtual = LocalDate.now();
		LocalDate amanha = dataAtual.plusDays(1);
		System.out.println("Hoje: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Amanhã: " + amanha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//25 dias atrás
		LocalDate dataPassada = dataAtual.minus(25, ChronoUnit.DAYS);
		System.out.println("Data passada: " + dataPassada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//Calculando quanto tempo falta para chegar em uma data específica
		MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
		LocalDate natalAnoCorrente = natal.atYear(Year.now().getValue());
		long diasAteNatal = dataAtual.until(natalAnoCorrente, ChronoUnit.DAYS);
		System.out.println("Faltam " + diasAteNatal + " dias para o natal.");
		
		// Calculando período entre duas datas
		LocalDate nascimento = LocalDate.of(1991, Month.MARCH, 28);
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(nascimento, hoje);
		System.out.println(periodo.getYears() + " anos " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias");
		
		//Intervalo de datas para computadores
		Instant inicio = Instant.now();
		//rodar algoritmo ...
		Instant fim = Instant.now();
		Duration duracao = Duration.between(inicio, fim);
		long duracaoEmMilissegundos = duracao.toMillis();
		System.out.println("Duração em milisegundos: " + duracaoEmMilissegundos);
		
		
	}

}
