package observer;

public class ObserverMain {

	public static void main(String[] args) {

		Uprajnenie uprajnenie = new Uprajnenie();
		Observer onlineZritel1 = new UprajnenieGledach("online Zritel 1");
		Observer onlineZritel2 = new UprajnenieGledach("online Zritel 2");
		Observer onlineZritel3 = new UprajnenieGledach("online Zritel 3");
		
		uprajnenie.gleda(onlineZritel1);
		uprajnenie.gleda(onlineZritel2);
		uprajnenie.gleda(onlineZritel3);
		
		uprajnenie.napraviUprajnenieIme("'stani'");
		uprajnenie.napraviUprajnenieIme("'legni'");
	}
}
