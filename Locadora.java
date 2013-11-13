import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Locadora {
	private IVeiculo veiculoDiariaMaisCara;
	private HashMap<String, IVeiculo> veiculos;
	
	
	public Locadora(){
		veiculos = new HashMap<>();
		veiculoDiariaMaisCara = null;
	}
	
	public void addVeiculos(IVeiculo v){
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
		IVeiculo v = veiculos.get(id);
		if (v == null){
			// levantar excecao
		}
		return v.getDiaria();
	}
	
	public int quantidadeVeiculos(){
		return veiculos.size();
	}
	
	public ArrayList<IVeiculo> getVeiculosPorTipo(Class<? extends IVeiculo> tipo){
		ArrayList<IVeiculo> resposta = new ArrayList<>();
		for(IVeiculo v : veiculos.values()){
			if (tipo.isInstance(v)){
				resposta.add(v);
			}
		}
		Collections.sort(resposta);
		return resposta;
	}
	
	public IVeiculo getVeiculoDiariaMaisCara(){
		return veiculoDiariaMaisCara;
	}
	
	

}
