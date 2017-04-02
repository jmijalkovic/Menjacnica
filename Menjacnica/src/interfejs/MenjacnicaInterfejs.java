package interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	public void dodavanjeKursa(String naziv, double prodajni, double srednji, double kupovni, GregorianCalendar datum);
	public void brisanjeKursa(String naziv, GregorianCalendar datum);
	public Kurs pronalazenjeKursa(String naziv, GregorianCalendar datum);
}
