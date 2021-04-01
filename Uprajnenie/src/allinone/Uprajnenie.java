package allinone;

import java.util.ArrayList;
import java.util.List;

public class Uprajnenie implements Observable {

	private List<Observer> observers = new ArrayList<>();
	private String uprajnenieIme;
	
	@Override
	public void gleda(Observer observer) {
		this.observers.add(observer);
		observer.napraviUprajnenie(this);
	}

	@Override
	public void neGleda(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void uvedomiGledachi() {
		for(Observer observer: this.observers) {
			observer.aktualizirane();
		}
	}

	@Override
	public String poluchiAktualizaciq() {
		return this.uprajnenieIme;
	}

	public void napraviUprajnenieIme(String uprajnenieIme) {
		this.uprajnenieIme = uprajnenieIme;
		this.uvedomiGledachi();
	}

}
