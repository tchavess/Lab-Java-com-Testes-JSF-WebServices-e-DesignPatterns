package br.com.caelum.argentum.reader;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.junit.Test;

import br.com.caelum.argentum.modelo.Negociacao;
import junit.framework.Assert;

public class LeitorXMLTest {

	@Test
	public void carregaXmlComUmaNegociacaoEmListaUnitaria() {
		String xmlDeTeste = "<list>" 
							+"<negociacao>" 
							+"<preco>43.5</preco>" 
							+"<quantidade>1000</quantidade>" 
							+"<data>" 
							+"<time>1322233344455</time>" 
							+"</data>" 
							+"</negociacao>" 
							+"</list>"; // o XML vai aqui!
	
		LeitorXML leitor = new LeitorXML();
	
		InputStream xml = new ByteArrayInputStream(xmlDeTeste.getBytes());
	
		List<Negociacao> negociacoes = leitor.carrega(xml);
	
		
		
		Assert.assertEquals(1, negociacoes.size());
		//Assert.assertEquals(43.5, negociacoes.));
	}

}
