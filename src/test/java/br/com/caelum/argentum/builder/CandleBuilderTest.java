package br.com.caelum.argentum.builder;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class CandleBuilderTest {

	@Test(expected = IllegalStateException.class)
	public void geracaoDeCandleDeveTerTodosOsDadosNecessarios() {
		Calendar hoje = Calendar.getInstance();
		
		new CandleBuilder().comAbertura(40.5)
		.comFechamento(42.3)/*.comMinimo(39.8)*/.comMaximo(45.0)
		.comVolume(145234.20).comData(hoje).geraCandle();
	}

}
