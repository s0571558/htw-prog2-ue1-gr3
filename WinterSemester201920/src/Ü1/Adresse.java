package Ü1;

public class Adresse {
	private  String strasse;
	private  String land;
	private String stadt;
	private  String plz;
	private  String nr;
	
	
	public Adresse(String strasse, String land, String stadt, String plz, String nr) {
		super();
		this.strasse = strasse;
		this.land = land;
		this.stadt = stadt;
		this.plz = plz;
		this.nr = nr;
	}
	
	public String toString() {
		return "Ihr Hotel befindet sich an der " + strasse + nr + plz;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

}