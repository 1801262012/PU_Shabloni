package allinone;

public class UprajnenieGledach implements Observer {

	
	private String ime;
	private Observable uprajnenie;
	
	public UprajnenieGledach(String ime) {
		this.ime = ime;
	}

	@Override
	public void aktualizirane() {
		if(this.uprajnenie == null) {
			System.out.println(this.ime + " nqma zadadeno uprajnenie");
			return;
		}
		String uprajnenieIme = this.uprajnenie.poluchiAktualizaciq();
		System.out.println(this.ime + " povtori uprajnenieto " + uprajnenieIme);
	}

	@Override
	public void napraviUprajnenie(Observable uprajnenie) {
		this.uprajnenie = uprajnenie;
	}
}