package modelo;

public class Socio {

	private String nom;
	private String cognoms;
	private String tipusSoci;
	private float importQuota;
	private String dni;
	private String domicili;
	private String localitat;
	
	public Socio(int id, String nom, String cognoms, String dni,
			String domicili, String localitat, String tipusSoci,
			float importQuota) {
		this.nom = nom;
		this.cognoms = cognoms;
		this.dni = dni;
		this.domicili = domicili;
		this.localitat = localitat;
		this.tipusSoci = tipusSoci;
		this.importQuota = importQuota;
	}

	public Socio() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	public String getTipusSoci() {
		return tipusSoci;
	}

	public void setTipusSoci(String tipusSoci) {
		this.tipusSoci = tipusSoci;
	}

	public float getImportQuota() {
		return importQuota;
	}

	public void setImportQuota(float importQuota) {
		this.importQuota = importQuota;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDomicili() {
		return domicili;
	}

	public void setDomicili(String domicili) {
		this.domicili = domicili;
	}

	public String getLocalitat() {
		return localitat;
	}

	public void setLocalitat(String localitat) {
		this.localitat = localitat;
	}

	@Override
	public String toString() {
		String salida = nom + " ";
		salida = salida + cognoms + " ";
		salida = salida + dni + " ";
		salida = salida + domicili + " ";
		salida = salida + localitat + " ";
		salida = salida + tipusSoci + " ";
		salida = salida + importQuota + "\n";
		
		return salida;
	}
}
