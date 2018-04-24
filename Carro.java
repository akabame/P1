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

public class Carro extends Veiculo{
	
	public Carro(int x,int y){
		super(x,y);
	}
	
	public void set(int a) {
		numPas = a;
	}
	
	public int getNumPas() {
		return numPas;	
	}
	
	
	private int numPas;
	

}
