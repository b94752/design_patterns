package comportement.observerObservable;

public class ConcreteObserver implements Observer{

	@Override
	public void update(Object object) {
		System.out.println("Je suis l'objet " + this + " qui re�oit : " + object + " en argument.");
	}

}
