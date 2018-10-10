package modelo.prototype;


import modelo.persona.Residente;

public class AptoImpl implements IAptoPrototype<AptoImpl> {
	private int idAptoImpl;
	private String nombreApto;
    private int numeroApto;
    private float largo;
    private float ancho;
    private int m2;
    private double valor;
    private Residente residente;
	
	public AptoImpl(String nombreApto,int numeroApto, float largo, float ancho, int m2, double valor,
			Residente residente) {
		this.nombreApto=nombreApto;
		this.numeroApto = numeroApto;
		this.largo = largo;
		this.ancho = ancho;
		this.m2 = m2;
		this.valor = valor;
		this.residente = residente;
	}

	public AptoImpl(int numeroApto) {
		this.numeroApto = numeroApto;
	}

	public AptoImpl() {
    }
    
    public int getIdAptoImpl() {
		return idAptoImpl;
	}

	public void setIdAptoImpl(int idAptoImpl) {
		this.idAptoImpl = idAptoImpl;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Residente getResidente() {
		return residente;
	}

	public void setResidente(Residente residente) {
		this.residente = residente;
	}
	
	public int getNumeroApto() {
		return numeroApto;
	}

	public void setNumeroApto(int numeroApto) {
		this.numeroApto = numeroApto;
	}
	

	public String getNombreApto() {
		return nombreApto;
	}

	public void setNombreApto(String nombreApto) {
		this.nombreApto = nombreApto;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public AptoImpl clone() {
		return new AptoImpl (this.nombreApto,this.numeroApto,this.largo,this.ancho,this.m2, this.valor,this.residente);
    }

    public AptoImpl deepClone() {
    	AptoImpl clone = new AptoImpl();
    	clone.setNombreApto(nombreApto);
		clone.setNumeroApto(numeroApto);
		clone.setLargo(largo);
		clone.setAncho(ancho);
		clone.setM2(m2);
		clone.setValor(valor);
		clone.setResidente(residente);
		return clone;
    }
    @Override
	public String toString() {
		
		return "Apto=" + nombreApto + ", idApto=\n" + idAptoImpl + ", valor=\n" + valor + '}';
	}

}