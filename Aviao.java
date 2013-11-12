
public class Aviao extends Aereo{
	private int velocidadeCruzeiro;

	public Aviao(String id, double valorCompra, int tempoVoo,
			int velocidadeCruzeiro) {
		super(id, valorCompra, tempoVoo);
		this.velocidadeCruzeiro = velocidadeCruzeiro;
	}

	public int getVelocidadeCruzeiro() {
		return velocidadeCruzeiro;
	}

	public void setVelocidadeCruzeiro(int velocidadeCruzeiro) {
		this.velocidadeCruzeiro = velocidadeCruzeiro;
	}

	
	public double getDiaria() {
		return 0.2*getValorCompra()+1000*getVelocidadeCruzeiro();
	}
	
	

}
