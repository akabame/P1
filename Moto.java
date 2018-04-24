/** 
 * @author Lucas de Arruda Campos Simoes - codigo:CC3642 - RA: 22117022-8
 * 
 * 
 * 
 * 
 * 
 * 
 * */

package p1Final;

public class Moto extends Veiculo {
	
	
	public Moto(int x,int y){
		super(x,y);
	}
	
	public void setTipo(String a) {
		tipo = a;
	}
	
	public String getTipo() {
		return tipo;
	}

	
	private String tipo;


}
