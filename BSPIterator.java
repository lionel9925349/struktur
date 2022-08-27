import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BSPIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3 wichtige Methoden
		// hasNext() = gibt uns ein true wieder wenn ein nächstes Element da ist
		// next() = gibt uns das Element / Objekt wieder wo sich der Pointer
		// befindet
		// remove() = löscht das Element / Obejkt wo sich der Pointer befindet

		List<String> list = new LinkedList<>();

		list.add("Michael");
		list.add("Chris");
		list.add("Peter");
		list.add("Petra");
		list.add("Andi");
		list.add("Hans");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);

			if (value.equals("Andi")) {
				it.remove();
			}

		}

		for (String string : list) {
			System.out.println(string);

		}

	}

}
