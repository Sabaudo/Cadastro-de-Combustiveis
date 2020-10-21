import java.util.ArrayList;

public class BombaCombustivel {
	private int id;

	private ArrayList<TipoCombustivel> ListaTipo;
	
	BombaCombustivel(){
		this.ListaTipo = new ArrayList<TipoCombustivel>();
	}
	
	public ArrayList<TipoCombustivel> getListaTipo() {
		return this.ListaTipo;
	}

	public void setTipo(ArrayList<TipoCombustivel> tipo) {
		this.ListaTipo = tipo;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void insertTipo(TipoCombustivel type) {
		this.ListaTipo.add(type);
	}
	
	
	
}
