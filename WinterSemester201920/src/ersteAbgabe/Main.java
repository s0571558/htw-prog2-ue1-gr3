package ersteAbgabe;
/**
 * 
 * @author vulong
 *
 */
public class Main {

	/**
	 * Diese Methode initialisiert das Programm und erstellt die entsprechenden Objekte
	 * @param args
	 */
	public static void main(String[] args) {
		
			Adresse adresse1 = new Adresse ("Georg-Gleisteinstraße","23",10451,"Berlin");
			Adresse adresse1_2 = new Adresse("nicht vorhanden", "x", 0,"x");
			Adresse adresse2 = new Adresse ("Bernauerstraße","11b",10341 ,"Berlin");
			Adresse adresse2_2 = new Adresse ("nicht vorhanden", "x", 0, "x");
			Adresse adresse3 = new Adresse ("Residenzstraße","84",13403,"Berlin");
			Adresse adresse3_2 = new Adresse ("Kantstraße", "92", 12934, "Berlin");	
			
			Bezahlmethode bezahlm1 = new Bezahlmethode ("PayPal", "fred.123@hotmail.de");
			Bezahlmethode bezahlm2 = new Bezahlmethode ("Bank", "Rosa_Blume@gmail.com");
			Bezahlmethode bezahlm3 = new Bezahlmethode ("Kreditkarte", "HerrLing@gmail.com");
			
			Adresse[] adressek1 = {adresse1, adresse1_2};
			Adresse[] adressek2 = {adresse2, adresse2_2};
			Adresse[] adressek3 = {adresse3, adresse3_2};
			
			Kunde kunde1 = new Kunde ("0921830", bezahlm1, "Herr","Fred","Feuerstein","03.11.1976",adressek1,"0301020234","fred.123@hotmail.de" );
			Kunde kunde2 = new Kunde ("1029384", bezahlm2, "Frau","Rosa","Blume","21.01.1980",adressek2,"0300923842","Rosa_Blume@gmail.com" );
			Kunde kunde3 = new Kunde ("9081231", bezahlm3, "Herr","Ling","Long","14.8.1991",adressek3,"0308127391","HerrLing@gmail.com" );

			Kunde[] kundeR = {kunde1, kunde2, kunde3};
			
			
			Adresse adresseR = new Adresse("Hauptstraße", "5a", 10559, "Berlin");			
			
			
			
			Reiseagentur MagicHolidaysReiseagentur = new Reiseagentur("Magic Holidays Reiseagentur", "DE812524001", adresseR, kundeR );
			

		
			 System.out.println(MagicHolidaysReiseagentur.toString());
			 
			 

	}

}
