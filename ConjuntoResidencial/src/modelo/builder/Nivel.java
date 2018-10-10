package modelo.builder;

import java.util.List;

import modelo.prototype.AptoImpl;

public class Nivel {
	
	private int idPiso;
	private List<AptoImpl> apto;
	
	
    public Nivel(int idPiso, List<AptoImpl> apto) {
		this.idPiso = idPiso;
		this.apto = apto;
	}

	public Nivel(int idPiso) {
		this.idPiso = idPiso;
	}

	public Nivel() {
    }

    public int getIdPiso() {
		return idPiso;
	}

	public void setIdPiso(int idPiso) {
		this.idPiso = idPiso;
	}

	public List<AptoImpl> getApto() {
		return apto;
	}

	public void setApto(List<AptoImpl> apto) {
		this.apto = apto;
	}
	


}