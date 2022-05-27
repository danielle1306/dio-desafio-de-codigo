package desafioDeProjetoDio;

import desafioDeProjetoDio.Singleton.SingletonEager;
import desafioDeProjetoDio.Singleton.SingletonLazy;
import desafioDeProjetoDio.Singleton.SingletonLazyHolder;
import desafioDeProjetoDio.strategy.ComportamentoAgresivo;
import desafioDeProjetoDio.strategy.ComportamentoDefensivo;
import desafioDeProjetoDio.strategy.ComportamentoNormal;
import desafioDeProjetoDio.strategy.Robo;
import desafioDeProjetoDio.strategy.comportamento;

public class teste {

	public static void main(String[] args) {
		
		//testes relacionados ao design pattern Singleton
		
	SingletonLazy lazy = SingletonLazy.getInstancia();
	System.out.println(lazy);
	lazy = SingletonLazy.getInstancia();
	System.out.println(lazy);
	
	SingletonEager eager = SingletonEager.getInstancia();
	System.out.println(eager);
	eager = SingletonEager.getInstancia();
	System.out.println(eager);
	
	SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
	System.out.println(lazyHolder);
	lazyHolder = SingletonLazyHolder.getInstancia();
	System.out.println(lazyHolder);

	
	//Strategy
	
	comportamento normal = new ComportamentoNormal();
	comportamento defensivo = new ComportamentoDefensivo();
	comportamento agressivo = new ComportamentoAgresivo();
	
	Robo robo = new Robo();
	robo.setStrategy(normal);
	robo.mover();
	robo.mover();
	
	robo.setStrategy(agressivo);
	robo.mover();
	robo.mover();
	robo.mover();
	
	robo.setStrategy(defensivo);
	robo.mover();
	robo.mover();
	
	
	//FACADE
	
	Facade facade = new Facade();
	facade.migrarCliente("Danielle", "18640508");
	
	
	
	
	
	}
	
	

}
