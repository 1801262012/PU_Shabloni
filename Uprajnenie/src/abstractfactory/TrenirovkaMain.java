package abstractfactory;

public class TrenirovkaMain {

	public static void main(String[] args) {

		Trenirovka uprajnenieNaTreniorList = TrenirovkaList.vidTrenirovka("STANI_LEGNI");
		UprajnenieNaTrenior stani = uprajnenieNaTreniorList.vidUprajnenie("STANI");
		stani.izpulni();	
		UprajnenieNaTrenior legni = uprajnenieNaTreniorList.vidUprajnenie("LEGNI");
		legni.izpulni();
	}
}
