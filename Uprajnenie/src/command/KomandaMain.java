package command;

public class KomandaMain {

	public static void main(String[] args) {

		RemoteController remoteController = new RemoteController();
		Poziciq poziciq = new Poziciq();
		
		Komanda StaniKomanda = new StaniKomanda(poziciq);
		Komanda LegniKomanda = new LegniKomanda(poziciq);

		remoteController.napraviKomanda(StaniKomanda);
		remoteController.poluchavaneNaKomanda();
		
		remoteController.napraviKomanda(LegniKomanda);
		remoteController.poluchavaneNaKomanda();
	}
}