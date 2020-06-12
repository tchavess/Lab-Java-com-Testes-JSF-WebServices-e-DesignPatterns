package br.com.caelum.argentum.testes;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.argentum.builder.CandleBuilder;
import br.com.caelum.argentum.modelo.Candlestick;

public class TestaCandleBuilder {
	
	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();
		
		Candlestick candle = new CandleBuilder().comAbertura(40.5)
				.comFechamento(42.3).comMinimo(39.8).comMaximo(45.0)
				.comVolume(145234.20).comData(hoje).geraCandle();
		
		System.out.println(candle);
	}

}
