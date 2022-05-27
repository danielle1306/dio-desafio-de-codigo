package desafioDeProjetoDio.Singleton;

//é uma classe estatica

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
}
	
	private SingletonLazyHolder() {
		super();
	
	}

	public static SingletonLazyHolder getInstancia() {
		return instanceHolder.instancia;
	}
}
