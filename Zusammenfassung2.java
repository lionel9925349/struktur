import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class VergleicheStringLaenge implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		int laenge1 = o1.length();
		int laenge2 = o2.length();

		if (laenge1 > laenge2) {
			return 1;
		} else if (laenge1 < laenge2) {
			return -1;
		} else {
			return 0;
		}

		// compare = Vergleiche
		// 1 = o1 größer o2
		// -1 = o1 kleiner als o2
		// 0 = beide gleich
	}
}

class UmgekehrteAlphabetischeReihenfolgeString implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}

}

public class Zusammenfassung2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Comparator = Vergleicher

		List<String> angestelltenListe = new ArrayList<>();

		angestelltenListe.add("Xan");
		angestelltenListe.add("Berndwerwe");
		angestelltenListe.add("Andir");
		angestelltenListe.add("Petrawerw");
		angestelltenListe.add("Peter");
		angestelltenListe.add("Christian");

		Collections.sort(angestelltenListe, new UmgekehrteAlphabetischeReihenfolgeString());

		
		
	}

}
