public class Osoba {
	private String imie, nazwisko;
	private Integer indeks;

	public Osoba() {
	}

	public Osoba(String imie, String nazwisko, Integer indeks) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.indeks = indeks;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Integer getIndeks() {
		return indeks;
	}

	public void setIndeks(Integer indeks) {
		this.indeks = indeks;
	}

	String osobaInfo() {
		return this.imie + " " + this.nazwisko + " (" + this.indeks + ")";
	}
}
