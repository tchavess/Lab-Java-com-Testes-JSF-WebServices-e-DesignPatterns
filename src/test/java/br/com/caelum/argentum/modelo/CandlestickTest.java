package br.com.caelum.argentum.modelo;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import junit.framework.Assert;

public class CandlestickTest {

	@Test(expected = IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinimo() {
		 new Candlestick(10, 20, 20, 10, 10000, Calendar.getInstance());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void quandoAberturaIgualFechamentoEhAlta() {
		
		Candlestick candle = new Candlestick(20, 20, 10, 20, 10000, Calendar.getInstance());
		
		Assert.assertEquals(true, candle.isAlta());
		
	}

}
