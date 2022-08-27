
public class Angestellter {

	private int id;
	private String name;
	private int geburtsJahr;

	public Angestellter(int id, int geburtsJahr, String name) {
		this.id = id;
		this.geburtsJahr = geburtsJahr;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGeburtsJahr() {
		return geburtsJahr;
	}

	public void setGeburtsJahr(int geburtsJahr) {
		this.geburtsJahr = geburtsJahr;
	}

	@Override
	public String toString() {
		return "Angestellter [id=" + id + ", name=" + name + ", geburtsJahr=" + geburtsJahr + "]";
	}

}
