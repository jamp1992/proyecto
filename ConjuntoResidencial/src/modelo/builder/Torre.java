package modelo.builder;



/**
 * 
 */
public class Torre {

    public Torre() {}
    
    private int idTorre;
    private String nombre;
    private int posicionX;
    private int posicionY;
    
    public static class TorreBuilder implements IBuilder<Torre>{

		@Override
		public Torre build() {
			// TODO Auto-generated method stub
			return null;
		}
    	
    }
    
    
    
    
	public int getIdTorre() {
		return idTorre;
	}
	public void setIdTorre(int idTorre) {
		this.idTorre = idTorre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
    
}