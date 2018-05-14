package createur;

/**
 * But : manipuler toujours la même instance d’un objet.
 * 
 * Solution : utiliser le mot clef static
 * 
 * @author benoit.charroux
 *
 */
public class SingletonFactory {

	// static rend unique en mémoire
	private static Singleton singleton = new Singleton();

	// méthode static
	public static Singleton getSingleton (){
		return singleton ;
	}

}
