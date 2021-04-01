package command;

public class LegniKomanda implements Komanda {

	private Poziciq poziciq;
	
	public LegniKomanda(Poziciq poziciq) {
		this.poziciq = poziciq;
	}

	@Override
	public void izpulni() {
		this.poziciq.smeniPoziciqNaLegni();
	}

}
