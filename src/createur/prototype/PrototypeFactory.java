package createur.prototype;

/**
 * But : Sp�cifier le genre d�objets � cr�er en utilisant un prototype d�instance.
 * 
 * @author benoit.charroux
 *
 */
public class PrototypeFactory {

	public static Prototype getPrototype(Type type){
		if(type == Type.Type1){
			return new Prototype1();
		}else{
			return new Prototype2();
		}
	}

}
