package createur;

public class SingletonFactory {

	// static rend unique en m�moire
	private static Singleton singleton = new Singleton();

	// m�thode static
	public static Singleton getSingleton (){
		return singleton ;
	}

}
