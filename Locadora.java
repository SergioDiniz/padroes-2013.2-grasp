import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Locadora<V extends Veiculo> {
	private V veiculoDiariaMaisCara;
	private HashMap<String, V> veiculos;
	
	
	public Locadora(){
		veiculos = new HashMap<>();
		veiculoDiariaMaisCara = null;
	}
	
	public void addVeiculos(V v){
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
	
	public ArrayList<V> getVeiculosPorTipo(Class<V> tipo){
		ArrayList<V> resposta = new ArrayList<>();
		for(V v : veiculos.values()){
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
