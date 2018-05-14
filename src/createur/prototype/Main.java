package createur.prototype;

public class Main {

	public static void main(String[] args) {
		
		Prototype p = PrototypeFactory.getPrototype(Type.Type1);
		if(p instanceof Prototype1){
			System.out.println("ok");
		} else {
			System.out.println("erreur");
		}	

	}

}
