package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{
	LinkedList<Valuta> valute=new LinkedList<Valuta>();
	@Override
	public void dodavanjeKursa(String naziv, double prodajni, double srednji, double kupovni, GregorianCalendar datum) {
		if(valute.isEmpty())
			throw new RuntimeException("Lista valuti je prazna!");
		else{
		 for(int i=0;i<valute.size();i++){
		 	if(valute.get(i).getNaziv().equals(naziv)){
		 		Kurs k=new Kurs();
				k.setDatum(datum);
		 		k.setKupovni(kupovni);
		 		k.setProdajni(prodajni);
				k.setSrednji(srednji);
		 		valute.get(i).getKursevi().add(k);
		 		break;
		 	}
		 }
		}
	}
	@Override
	public void brisanjeKursa(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Kurs pronalazenjeKursa(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}
}
