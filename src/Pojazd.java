public class Pojazd {
	protected String marka;
	protected int cena;
	private int iloscKol;

	public Pojazd() {
		this.marka = "";
		this.cena = 0;
		this.iloscKol = 0;
	}

	public Pojazd(String marka, int cena, int iloscKol) {
		this.marka = marka;
		this.cena = cena;
		this.iloscKol = iloscKol;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public int getIloscKol() {
		return iloscKol;
	}

	public void setIloscKol(int iloscKol) {
		this.iloscKol = iloscKol;
	}

	protected int Koszt() {
		return this.cena;
	}

	@Override
	public String toString() {
		return this.marka +
			", cena: " + this.Koszt();
	}
}
