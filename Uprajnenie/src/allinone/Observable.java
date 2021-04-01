package allinone;

public interface Observable {
	void gleda(Observer observer);
	void neGleda(Observer observer);
	void uvedomiGledachi();
	String poluchiAktualizaciq();
}
