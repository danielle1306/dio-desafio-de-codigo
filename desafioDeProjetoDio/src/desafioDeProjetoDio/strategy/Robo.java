package desafioDeProjetoDio.strategy;

public class Robo {
	
	private comportamento strategy;

	public void setStrategy(comportamento strategy) {
		this.strategy = strategy;
	}
	
	public void mover() {
		strategy.mover();
		
	}
		

}
