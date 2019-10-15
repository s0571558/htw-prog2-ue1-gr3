package Ü1;
	
public class Guest {

	private String name;
	private Adresse privatAdresse;
	private Adresse businessAdresse;
	
	public Guest(String name) {
		this.name = name;
	}
	public void setPrivateAdress(Adresse adresse) {
		this.privatAdresse = adresse;
	}
	public void setBusinessAdress(Adresse adresse) {
		this.businessAdresse = adresse;
	}
	public String toString() {
		return name + ", " + privateAdresse + ","  
	}
}
