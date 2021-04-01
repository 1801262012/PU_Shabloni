package allinone;

public class UprajnenieNaTreniorList extends Trenirovka {

	@Override
	UprajnenieNaTrenior vidUprajnenie(String name) {

		if(name == "STANI") {
			return new Stani();
		}
		
		if(name == "LEGNI") {
			return new Legni();
		}
		
		System.out.println("Nepoznata komanda: " + name);
		
		return null;
	}

}
