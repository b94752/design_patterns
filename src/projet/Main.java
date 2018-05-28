package projet;

public class Main {

	public static void main(String[] args) {
		
		Voiture ferrari = new Voiture();
		
		Passager tintin = new Passager();
		ferrari.addPassager(tintin);
		
		Passager haddock = new Passager();
		ferrari.addPassager(haddock);
		
		System.out.println(ferrari);
	}

}
