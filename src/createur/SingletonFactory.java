package createur;

/**
 * But : manipuler toujours la m�me instance d�un objet.
 * 
 * Solution : utiliser le mot clef static
 * 
 * @author benoit.charroux
 *
 */
public class SingletonFactory {

	// static rend unique en m�moire
	private static Singleton singleton = new Singleton();

	// m�thode static
	public static Singleton getSingleton (){
		return singleton ;
	}

}
