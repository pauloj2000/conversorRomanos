package conversor;

import java.util.Iterator;
import java.util.Map.Entry;

public class ConversorRomanos {

	private String stringResultante;
	
	public Integer convertaAlgarismoRomano(String algarismoRomano) {
		
		Integer resultado = 0;
		
		resultado = obtenhaValoresDoisAlgarismos(algarismoRomano);
		
		resultado += obtenhaValoresUmAlgarismo(stringResultante);
		
		return resultado;
		
	}
	
	private Integer obtenhaValoresUmAlgarismo(String stringResultante) {
	Integer resultado = 0;
		
		DicionarioNumeros dicionario = DicionarioNumeros.getInstancia();
		
		dicionario.retornaCorrespondenteSimples(stringResultante);
		
		for (Iterator<Entry<String, Integer>> iterator = dicionario.dominioSimples.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, Integer> me = iterator.next();
			if(stringResultante.contains((String) me.getKey())) {
				resultado += (Integer) me.getValue();
				
				stringResultante = stringResultante.replaceAll((String) me.getKey(), "");
			}
		}
		
		return resultado;
	}

	private Integer obtenhaValoresDoisAlgarismos(String algarismoRomano) {
		
		Integer resultado = 0;
		
		DicionarioNumeros dicionario = DicionarioNumeros.getInstancia();
		
		dicionario.retornaCorrespondenteComposto(algarismoRomano);
		
		for (Iterator<Entry<String, Integer>> iterator = dicionario.dominioComposto.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, Integer> me = iterator.next();
			if(algarismoRomano.contains((String) me.getKey())) {
				resultado += (Integer) me.getValue();
				
				algarismoRomano = algarismoRomano.replaceAll((String) me.getKey(), "");
			}
		}
		
		stringResultante = algarismoRomano;
		
		return resultado;
	}
}
