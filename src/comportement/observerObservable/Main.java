package comportement.observerObservable;

public class Main {

	public static void main(String[] args) {
		
		ConcreteSubject subject = new ConcreteSubject(); 
		
		ConcreteObserver observer1 = new ConcreteObserver();
		subject.attach(observer1);
		
		ConcreteObserver observer2 = new ConcreteObserver();
		subject.attach(observer2);
		
		String s = "Bonjour";
		subject.notify(s);
		
	}

}
