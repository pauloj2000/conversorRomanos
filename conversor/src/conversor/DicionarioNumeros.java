package conversor;

import java.util.HashMap;

public class DicionarioNumeros {
	
	public static DicionarioNumeros getInstancia() {
	    if (instancia == null) instancia = new DicionarioNumeros();
	    return instancia;
	}
	    
	public Integer retornaCorrespondenteSimples(String algarismoRomano) {
		if(dominioSimples.get(algarismoRomano) == null) {
			return 0;
		}
	
		return dominioSimples.get(algarismoRomano);
	}
	
	public Integer retornaCorrespondenteComposto(String algarismoRomano) {
		if(dominioComposto.get(algarismoRomano) == null) {
			return 0;
		}
		
		return dominioComposto.get(algarismoRomano);
	}
	
	private DicionarioNumeros() {
		preencheDicionarioUmAlgarismo();
		preencheDicionarioDoisAlgarismos();
	}
	
	public HashMap<String, Integer> dominioSimples = new HashMap<>();
	
	public HashMap<String, Integer> dominioComposto = new HashMap<>();
	
	private static DicionarioNumeros instancia;

	private void preencheDicionarioUmAlgarismo() {
	    dominioSimples.put("I", 1);
	    dominioSimples.put("V", 5);
	    dominioSimples.put("X", 10);
	    dominioSimples.put("L", 50);
	    dominioSimples.put("C", 100);
	    dominioSimples.put("D", 500);
	    dominioSimples.put("M", 1000);
	}
	
	private void preencheDicionarioDoisAlgarismos() {
		dominioComposto.put("IV", 4);
		dominioComposto.put("IX", 9);
		dominioComposto.put("XL", 40);
		dominioComposto.put("XC", 90);
		dominioComposto.put("CD", 400);
		dominioComposto.put("CM", 900);
	}
}