
public abstract class Veiculo implements IVeiculo{
	private String id;
	private double valorCompra;
	
	public Veiculo(String id, double valorCompra) {
		this.id = id;
		this.valorCompra = valorCompra;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public double getValorCompra() {
		return valorCompra;
	}
	
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public abstract double getDiaria();

	public int compareTo(IVeiculo v){
		return getId().compareTo(v.getId());
	}
}
