
public class Carro extends Terrestre{
	private double autonomia;

	public Carro(String id, double valorCompra, double motor, String placa,
			double autonomia) {
		super(id, valorCompra, motor, placa);
		this.autonomia = autonomia;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	@Override
	public double getDiaria() {
		return 0.02*getValorCompra();
	}
	
	

}
