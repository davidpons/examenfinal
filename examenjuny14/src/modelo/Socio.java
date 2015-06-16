package modelo;

public class Socio {

	private String nom;
	private String cognoms;
	private String tipusSoci;
	private float importQuotaImpagada;
	
	@Override
	public String toString() {
		String salida = nom + " ";
		salida = salida + cognoms + " ";
		salida = salida + tipusSoci + " ";
		salida = salida + importQuotaImpagada + "\n";
		
		return salida;
	}
}
