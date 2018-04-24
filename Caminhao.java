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

public class Caminhao extends Veiculo {

	
	public Caminhao(int x,int y){
		super(x,y);
	}
	
	public void setCapCarga(int a) {
		capCarga = a;	
	}
	
	public int getCapCarga() {
		return capCarga;
	}

	
	private int capCarga;
	
}
