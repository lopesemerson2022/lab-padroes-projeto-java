package one.digitalinnovation.singleton;

/**
 * Singleton "apressado".
 * 
 * 
 * @author lopes
 *
 */

public class SingletonEager {
	
    private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}

}
