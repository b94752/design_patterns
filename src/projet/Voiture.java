package projet;

import java.util.ArrayList;
import java.util.Collection;

public class Voiture {
	
	Collection<Passager> passagers = new ArrayList<Passager>();

	public Collection<Passager> getPassagers() {
		return passagers;
	}

	public void setPassagers(Collection<Passager> passagers) {
		this.passagers = passagers;
	}
	
	public void addPassager(Passager passager) {
		passagers.add(passager);
		passager.setVoiture(this);
	}

	@Override
	public String toString() {
		return "Voiture [passagers=" + passagers + "]";
	}
	
	

}
