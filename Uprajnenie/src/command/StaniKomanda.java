package command;

public class StaniKomanda implements Komanda {

	private Poziciq poziciq;
	
	public StaniKomanda(Poziciq poziciq) {
		this.poziciq = poziciq;
	}

	@Override
	public void izpulni() {
		this.poziciq.smeniPoziciqNaStani();
	}

}
