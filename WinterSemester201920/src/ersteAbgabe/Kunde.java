package ersteAbgabe;

/**
 * 
 * @author vulong
 *
 */
public class Kunde {
	private String kundennummer;
	private Bezahlmethode bezahlmethoden ;
	private String anrede;
	private String vorname;
	private String nachname;
	private String geburtsdatum;
	private Adresse[] adresse = new Adresse [2];
	private String tnummer;		
	private String email;
	
	/**
	 * Es erstellt eine Instanz des Kunden (Konstruktor)
	 * @param kundennummer
	 * @param bezahlmethoden
	 * @param anrede
	 * @param vorname
	 * @param nachname
	 * @param geburtsdatum
	 * @param adresse
	 * @param tnummer
	 * @param email
	 */
	
	public Kunde(String kundennummer, Bezahlmethode bezahlmethoden, String anrede, String vorname, String nachname,
			String geburtsdatum, Adresse[] adresse, String tnummer, String email) {
		super();
		this.kundennummer = kundennummer;
		this.bezahlmethoden = bezahlmethoden;
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.adresse = adresse;
		this.tnummer = tnummer;
		this.email = email;
	}
	
	/**
	 * Methode um alle Informationen der einzelnen Kunden zu zeigen
	 * @return kundennummer, anrede, nachname, vorname, geburtsdatum, bezahlmethoden, adressen, email, telefonnummer
	 */
	public String toString() {
		
		return "Kundennummer: " + kundennummer + "\nAnrede:" + anrede + "\nNachname:" + nachname + "\nVorname: " + vorname +"\nGeburtsdatum: " + geburtsdatum + "\nBezahlmethode: " + bezahlmethoden.toString() + "\nAdressen: " + "\n 1.Adresse: " + adresse[0] + "\n 2.Adresse " + adresse[1] + "\nEmail: " + email + "\nTelefonnummer: " + tnummer + "\n---"; 
 	}
	
	public String getKundennummer() {
		return kundennummer;
	}
	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
	}
	public Bezahlmethode getBezahlmethoden() {
		return bezahlmethoden;
	}
	public void setBezahlmethoden(Bezahlmethode bezahlmethoden) {
		this.bezahlmethoden = bezahlmethoden;
	}
	public String getAnrede() {
		return anrede;
	}
	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	public Adresse[] getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse[] adresse) {
		this.adresse = adresse;
	}
	public String getTnummer() {
		return tnummer;
	}
	public void setTnummer(String tnummer) {
		this.tnummer = tnummer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
		
		}
