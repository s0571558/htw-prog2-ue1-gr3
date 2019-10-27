package ersteAbgabe;
	/**
	 * 
	 * @author vulong
	 *
	 */
public class Bezahlmethode {
	private String bezeichnung ;
	private String beschreibung;
	
	
	
	/**
	 * 
	 * @param bezeichnung
	 * @param beschreibung
	 */
	public Bezahlmethode(String bezeichnung, String beschreibung) {
		super();
		this.setBezeichnung(bezeichnung);
		this.beschreibung = beschreibung;
	}
	
	/**
	 * Methode um die genaue Bezeichnung zu zeigen
	 * return bezichnung
	 */
	
	public String toString() {
		return  bezeichnung;
	}
	
	
	/**
	 * Methode um die Bezeichung für die Bezahlmethode zu zeigen
	 * @return bezeichnung
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	/**
	 * Die Methode erlaubt es den Kunden sich eine Bezahlmethode von den unten
	 * genannten auszuwählen
	 * @param bezeichnung
	 */
	
	

	
	public void setBezeichnung(String bezeichnung) {
	
		switch (bezeichnung) {
		case ("PayPal"):
			this.bezeichnung = bezeichnung;
			break;	
		case ("Kreditkarte"):
			this.bezeichnung = bezeichnung;
			break;
		case("Bank"):
			this.bezeichnung = bezeichnung;
			break;
		default:
			System.out.println("Diese Zahlmethode ist nicht bekannt");
			
		
		}
	
		
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	

}
