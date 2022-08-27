import java.util.*;

class Person implements Comparable<Person> {

	private String vorName;

	public Person(String vorName) {
		this.vorName = vorName;
	}

	@Override
	public String toString() {
		return "Person [vorName=" + vorName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vorName == null) ? 0 : vorName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (vorName == null) {
			if (other.vorName != null)
				return false;
		} else if (!vorName.equals(other.vorName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {
		
		int laenge1 = vorName.length();
		int laenge2 = o.vorName.length();
		
		if (laenge1 > laenge2) {
			return 1;
		}else if (laenge1 < laenge2){
			return -1;
		}else {
			return vorName.compareTo(o.vorName);
		}
		
	}

}

public class Zusammenfassung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 = Beide gleich
		// 1 = Objekt ist größer
		// -1 = Objekt ist kleiner

		// Strukturen

		// Liste / List -> Einkaufsliste
		List<Person> list = new ArrayList<>();

		Zusammenfassung.addElements(3, list);
		
		Collections.sort(list);
		
		Zusammenfassung.getElements(list);

		System.out.println("------");
		// Set / Menge -> Schublade voll mit Elementen -> kein doppeltes Element
		Set<Person> set = new TreeSet<>();
		
		Zusammenfassung.addElements(5, set);
		Zusammenfassung.getElements(set);
		

		// System.out.println("------");
		// // Map / verbindung zwischen 2 Elementen -> Artikel hat eine
		// eizigartige
		// // Artikelnummer
		// Map<Integer, String> map = new TreeMap<>();
		//
		// map.put(4, "Katze");
		// map.put(2, "Hund");
		// map.put(1, "Kaninchen");
		// map.put(3, "Aal");
		//
		// for (Integer key : map.keySet()) {
		// System.out.println("Key: " + key + " Inahlt: " + map.get(key));
		// }
	}

	public static void addElements(int anzahlPerson, Collection<Person> col) {
		for (int i = 1; i <= anzahlPerson; i++) {
			Scanner scanName = new Scanner(System.in);
			System.out.println("Name eingeben: ");
			String eingabeName = scanName.next();
			Person person = new Person(eingabeName);
			col.add(person);
		}
	}

	public static void getElements(Collection<Person> col) {
		for (Person person : col) {
			System.out.print("Name der Person: ");
			System.out.println(person);
		}
	}

}
