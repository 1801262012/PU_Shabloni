package abstractfactory;

public class TrenirovkaList {
	
	public static Trenirovka vidTrenirovka(String name) {
		
		if(name == "STANI_LEGNI") {
			return new UprajnenieNaTreniorList();
		}
		
		System.out.println("Nepoznata trenirovka: " + name);
		return null;
	}
	
}
