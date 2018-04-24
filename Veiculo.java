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
import java.util.*;

public class Veiculo { 

	
	public Veiculo(int x,int y) { /// constructor veiculo: para setar os valores de x e y
		this.x = x;
		this.y = y;
		
	}	
	public void setVel(int a) {     ///
		vel = a;
	}
	
	public void setFab(Boolean a) {
		fab = a;
	}
	
	public void setCor(String a) {
		cor = a;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getVel() {
		return vel;
	}
	
	public Boolean getFab() {
		return fab;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void move(int vel) {
		if(vel ==1){
			Random gerador = new Random();
			int g = gerador.nextInt(4);
			if(g == 0){
				if(y == 59){
					y = 0;
				}else{
					y = y + 1;
				}
				
			}
			else if(g == 1){
				if(y == 0){
					y = 59;
				}else{
					y = y - 1;
				}
				
			}
			else if(g == 2){
				if(x == 29){
					y = 0;
				}else{
					x = x + 1;
				}
				
			}
			else if(g == 3){
				if(x == 0){
					y = 29;
				}else{
					x = x - 1;
				}
				
			}
			
		}
		else if(vel ==2){
			Random gerador = new Random();
			int g = gerador.nextInt(4);
			if(g == 0){
				if(y == 59){
					y = 1;
				}else if(y == 58){
					y = 0;
				}else{
					y = y + 2;
				}
			}
			else if(g == 1){
				if(y == 0){
					y = 58;
				}else if(y == 1){
					y = 59;
				}else{
					y = y - 2;
				}
			}
			else if(g == 2){
				if(x == 29){
					x = 1;
				}else if(x == 28){
					x = 0;
				}else{
					x = x + 2;
				}
			}
			else if(g == 3){
				if(x == 0){
					x = 28;
				}else if(x == 1){
					x = 29;
				}else{
					x = x - 2;
				}
			}
			
		}
		else if(vel ==3){
			Random gerador = new Random();
			int g = gerador.nextInt(4);
			if(g == 0){
				if(y == 59){
					y = 2;
				}else if(y == 58){
					y = 1;
				}else if(y == 57){
					y = 0;
				}
				else{
					y = y + 3;
				}
			}
			else if(g == 1){
				if(y == 0){
					y = 57;
				}else if(y == 1){
					y = 58;
				}else if(y == 2){
					y = 59;
				}
				else{
					y = y - 3;
				}
			}
			else if(g == 2){
				if(x == 29){
					x = 2;
				}else if(x == 28){
					x = 1;
				}else if(x == 27){
					x = 0;
				}
				else{
					x = x + 3;
				}
			}
			else if(g == 3){
				if(x == 0){
					x = 27;
				}else if(x == 1){
					x = 28;
				}else if(x == 2){
					x = 29;
				}
				else{
					x = x - 3;
				}
			}
			
		}
	}

	
	
	
	protected int x;
	protected int y;
	private int vel;
	private Boolean fab;
	private String cor;
	
	
	
	
	
	
	
	
	
}
