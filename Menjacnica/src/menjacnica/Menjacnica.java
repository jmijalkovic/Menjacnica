package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{
	private LinkedList<Valuta> valute=new LinkedList<Valuta>();
	
	@Override
	public void dodavanjeKursa(String naziv, double prodajni, double srednji, double kupovni, GregorianCalendar datum) {
		Kurs k=new Kurs();
		k.setDatum(datum);
		k.setKupovni(kupovni);
		k.setProdajni(prodajni);
		k.setSrednji(srednji);
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).getNaziv().equals(naziv)){
				valute.get(i).getKursevi().add(k);
				break;
			}
		}
	}
	@Override
	public void brisanjeKursa(String naziv, GregorianCalendar datum) {
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).getNaziv().equals(naziv)){
				LinkedList<Kurs> kursnaLista=valute.get(i).getKursevi();
				for(int j=0;j<kursnaLista.size();j++){
				if(kursnaLista.get(j).getDatum().equals(datum)){
					kursnaLista.remove(j);
					break;
					}
				}	
			}
		}
		
	}
	@Override
	public Kurs pronalazenjeKursa(String naziv, GregorianCalendar datum) {
			for(int i=0;i<valute.size();i++){
				if(valute.get(i).getNaziv().equals(naziv)){
					LinkedList<Kurs> kursnaLista=valute.get(i).getKursevi();
					for(int j=0;j<kursnaLista.size();j++){
						if(kursnaLista.get(j).getDatum().equals(datum)){
							return kursnaLista.get(j);
						}
					}
				}
			}
		return null;
	}
}
