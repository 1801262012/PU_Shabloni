package allinone;

public class Poziciq {

	private Boolean poziciqStani;
	
	public void smeniPoziciqNaStani() {
		System.out.println("Trenirashtiqt stava");
		this.poziciqStani = true;
	}
	
	public void smeniPoziciqNaLegni() {
		System.out.println("Trenirashtiqt lqga");
		this.poziciqStani = false;
	}
}
