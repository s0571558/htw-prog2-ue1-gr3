package ersteAbgabe;

import java.util.Arrays;

/**
 * 
 * @author vulong
 *
 */
public class Reiseagentur {
	private String name;
	private String ustindr;
	private Adresse adresse;
	private Kunde[] kunden;

	/**
	 * Es erstellt eine Instanz der Reiseagentur (Konstruktor)
	 * @param name
	 * @param uSTIDNR
	 * @param adresse
	 * @param kunden
	 */
	public Reiseagentur(String name, String uSTIDNR, Adresse adresse, Kunde[] kunden) {
		super();
		this.name = name;
		ustindr = uSTIDNR;
		this.adresse = adresse;
		this.kunden = kunden;
	}

	/**
	 * Methode um alle Informationen zur Reiseagentur zu zeigen
	 * @return name, ustindr, adresse, kunden, 
	 */
	public String toString() {

		return "Name: " + name + "\nUST-IDNR:" + ustindr + "\nAdresse:" + adresse.toString() + "\nKunden:" + "\n"
				+ kunden[0] + kunden[1] + kunden[2];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUSTIDNR() {
		return ustindr;
	}

	public void setUSTIDNR(String uSTIDNR) {
		ustindr = uSTIDNR;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Kunde[] getKunden() {
		return kunden;
	}

	public void setKunden(Kunde[] kunden) {
		this.kunden = kunden;
	}

}