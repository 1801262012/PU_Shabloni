package allinone;

public class TrenirovkaMain {

	public static void main(String[] args) {

		// ��� �� ��������
		Trenirovka uprajnenieNaTreniorList = TrenirovkaList.vidTrenirovka("STANI_LEGNI");
		UprajnenieNaTrenior stani = uprajnenieNaTreniorList.vidUprajnenie("STANI");
		UprajnenieNaTrenior legni = uprajnenieNaTreniorList.vidUprajnenie("LEGNI");
		
		// ��� �� ����������
		RemoteController remoteController = new RemoteController();
		Poziciq poziciq = new Poziciq();
		Komanda StaniKomanda = new StaniKomanda(poziciq);
		Komanda LegniKomanda = new LegniKomanda(poziciq);
		
		// ��� �� ���������
		Uprajnenie uprajnenie = new Uprajnenie();
		Observer onlineZritel1 = new UprajnenieGledach("online Zritel 1");
		Observer onlineZritel2 = new UprajnenieGledach("online Zritel 2");
		Observer onlineZritel3 = new UprajnenieGledach("online Zritel 3");
		uprajnenie.gleda(onlineZritel1);
		uprajnenie.gleda(onlineZritel2);
		uprajnenie.gleda(onlineZritel3);
		
		// �������	
		stani.izpulni();
		
		// ��������
		remoteController.napraviKomanda(StaniKomanda);
		remoteController.poluchavaneNaKomanda();
		
		// �������
		uprajnenie.napraviUprajnenieIme("'stani'");
		
		//__________________________________________________________________________________________
		
		legni.izpulni();
						
		remoteController.napraviKomanda(LegniKomanda);
		remoteController.poluchavaneNaKomanda();		

		uprajnenie.napraviUprajnenieIme("'legni'");
		//
	}
}
