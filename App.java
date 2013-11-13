
public class App {
	
	public static void main(String[] args) {
		Locadora loc = new Locadora();
		loc.addVeiculos( new Carro("id1", 12000.00, 0.8, "mx", 16.0) );
		loc.addVeiculos( new Carro("id2", 120.00, 0.8, "mx", 16.0) );
		loc.addVeiculos( new Aviao("id3", 10000000.00, 10, 800) );
		System.out.println(loc.getDiaria("id3"));
		System.out.println(loc.quantidadeVeiculos());
		System.out.println(loc.getVeiculoDiariaMaisCara().getId());
		
		for(IVeiculo v : loc.getVeiculosPorTipo(Carro.class)){
			System.out.println(v.getId());
		}
	}

}
