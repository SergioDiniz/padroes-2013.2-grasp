import java.util.ArrayList;
import java.util.Collections;
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
	
	public ArrayList<Veiculo> getVeiculosPorTipo(Class<? extends Veiculo> tipo){
		ArrayList<Veiculo> resposta = new ArrayList<>();
		for(Veiculo v : veiculos.values()){
			if (tipo.isInstance(v)){
				resposta.add(v);
			}
		}
		Collections.sort(resposta);
		return resposta;
	}
	
	public Veiculo getVeiculoDiariaMaisCara(){
		return veiculoDiariaMaisCara;
	}
	
	

}
