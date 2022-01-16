public class Samochod extends Pojazd {
	protected int moc;
	protected int ubezpieczenie;
	private int pojemnosc;

	public Samochod() {
		super();
		this.moc = 0;
		this.ubezpieczenie = 0;
		this.pojemnosc = 0;
	}

	public Samochod(int moc, int ubezpieczenie, int pojemnosc) {
		this.moc = moc;
		this.ubezpieczenie = ubezpieczenie;
		this.pojemnosc = pojemnosc;
	}

	public Samochod(String marka, int cena, int moc, int ubezpieczenie, int pojemnosc) {
		super(marka, cena, 4);
		this.moc = moc;
		this.ubezpieczenie = ubezpieczenie;
		this.pojemnosc = pojemnosc;
	}

	public int getMoc() {
		return moc;
	}

	public void setMoc(int moc) {
		this.moc = moc;
	}

	public int getUbezpieczenie() {
		return ubezpieczenie;
	}

	public void setUbezpieczenie(int ubezpieczenie) {
		this.ubezpieczenie = ubezpieczenie;
	}

	public int getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(int pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	@Override
	protected int Koszt() {
		return super.Koszt() + this.ubezpieczenie;
	}

	@Override
	public String toString() {
		return this.marka +
			" (" + this.moc + "KM)" +
			", cena: " + this.Koszt();
	}
}
