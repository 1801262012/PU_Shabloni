package command;

public class RemoteController {

	private Komanda komanda;
	
	public void napraviKomanda(Komanda komanda) {
		this.komanda = komanda;
	}

	public void poluchavaneNaKomanda() {
		this.komanda.izpulni();
	}
	
}
