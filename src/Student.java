public class Student {
	String imie;
	String nazwisko;
	int wiek;
	boolean aktywny;

	@Override
	public String toString() {
		return this.imie + " " + this.nazwisko + " (" + this.wiek + ") - " + (this.aktywny ? "Aktywny" : "Nieaktywny");
	}
}
