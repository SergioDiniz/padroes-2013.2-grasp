
public abstract class Aereo extends Veiculo {
	private int tempoVoo;

	public Aereo(String id, double valorCompra, int tempoVoo) {
		super(id, valorCompra);
		this.tempoVoo = tempoVoo;
	}

	public int getTempoVoo() {
		return tempoVoo;
	}

	public void setTempoVoo(int tempoVoo) {
		this.tempoVoo = tempoVoo;
	}
	
	
	

}
