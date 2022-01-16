public class SamochodElektryczny extends Samochod {
	private int bateria;

	public SamochodElektryczny() {
		super();
		this.bateria = 0;
	}

	public SamochodElektryczny(int bateria) {
		this.bateria = bateria;
	}

	public SamochodElektryczny(int moc, int ubezpieczenie, int bateria) {
		super(moc, ubezpieczenie, 0);
		this.bateria = bateria;
	}

	public SamochodElektryczny(String marka, int cena, int moc, int ubezpieczenie, int bateria) {
		super(marka, cena, moc, ubezpieczenie, 0);
		this.bateria = bateria;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	@Override
	protected int Koszt() {
		return super.Koszt() - 30000; // dofinansowanie
	}

	@Override
	public String toString() {
		return this.marka +
			" " + this.bateria + "kWh " +
			" (" + this.moc + "KM)" +
			", cena: " + this.Koszt();
	}
}
