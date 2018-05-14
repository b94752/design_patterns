package createur;

public class SingletonFactory {

	// static rend unique en mémoire
	private static Singleton singleton = new Singleton();

	// méthode static
	public static Singleton getSingleton (){
		return singleton ;
	}

}
