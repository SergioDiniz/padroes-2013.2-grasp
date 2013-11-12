import java.util.ArrayList;
import java.util.HashMap;


public class Locadora {
	private Veiculo veiculoDiariaMaisCara;
	private HashMap<String, Veiculo> veiculos;
	
	
	public Locadora(){
		veiculos = new HashMap<>();
		veiculoDiariaMaisCara = null;
	}
	
	public void addVeiculos(Veiculo v){
		String id = v.getId();
		if (!veiculos.containsKey(id)){
			veiculos.put(id, v);
			
			if (veiculoDiariaMaisCara == null){
				veiculoDiariaMaisCara = v;
			}else{
				if (v.getDiaria() > veiculoDiariaMaisCara.getDiaria()){
					veiculoDiariaMaisCara = v;
				}
			}
			
			
		}else{
			// levantar excecao
		}
	}
	
	public double getDiaria(String id){
		Veiculo v = veiculos.get(id);
		if (v == null){
			// levantar excecao
		}
		return v.getDiaria();
	}
	
	public int quantidadeVeiculos(){
		return veiculos.size();
	}
	
	public ArrayList<? extends Veiculo> getVeiculosPorTipo(Class<Veiculo> tipo){
		ArrayList<? extends Veiculo> resposta = new ArrayList<>();
	}
	
	public Veiculo getVeiculoDiariaMaisCara(){
		return veiculoDiariaMaisCara;
	}
	
	

}
