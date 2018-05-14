package createur.prototype;

/**
 * But : Spécifier le genre d’objets à créer en utilisant un prototype d’instance.
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
