package ersteAbgabe;

/**
 * 
 * @author vulong
 *
 */
public class Adresse {
	private String straße;
	private String hausnummer;
	private int plz;
	private String ort;
	
	/**
	 * Es erstellt eine Instanz der Adresse (Konstruktor)
	 * @param straße
	 * @param hausnummer
	 * @param plz
	 * @param ort
	 */
	
	public Adresse(String straße, String hausnummer, int plz, String ort) {
		super();
		this.straße = straße;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}
	 
	/**
	 * Methode um Informationen zur Adresse zu zeigen
	 * @return straße, hausnummer, plz, ort
	 */
	public String toString() {
		
		return straße + " " + hausnummer + " " + plz + " " + ort ;
	}
	
	public String getStraße() {
		return straße;
	}


	public void setStraße(String straße) {
		this.straße = straße;
	}


	public String getHausnummer() {
		return hausnummer;
	}


	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}


	public int getPlz() {
		return plz;
	}


	public void setPlz(int plz) {
		this.plz = plz;
	}


	public String getOrt() {
		return ort;
	}


	public void setOrt(String ort) {
		this.ort = ort;
	}


	
	
	

}
