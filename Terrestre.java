
public abstract class Terrestre extends Veiculo {
	private double motor;
	private String placa;
	
	public Terrestre(String id, double valorCompra, double motor, String placa) {
		super(id, valorCompra);
		this.motor = motor;
		this.placa = placa;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	

}
