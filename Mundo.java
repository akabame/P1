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
import java.util.ArrayList;

public class Mundo {

	public void setMapa(int a) {
		mapa = a;
	}
	
	public void setTamX(int a) {
		tamX = a;
	}
	
	public void setTamY(int a) {
		tamY = a;
	}
	
	public int getMapa() {
		return mapa;
	}
	
	public int getTamX() {
		return tamX;
	}
	
	public int getTamY() {
		return tamY;
	}
	
	public void Cria(ArrayList<Moto> moto, ArrayList<Carro> carro, ArrayList<Caminhao> caminhao) {
		
		for(int i =0; i< 30; i++) {
			for(int j = 0; j< 60; j++) {
				if(i == 0|| i == 29 || j == 0 || j ==59) {
					mundo[i][j] = 1;
				}else{
					mundo[i][j] = 0;
				}
				if(j>=4 && j<8 && i>=2 && i<= 4) {
					mundo[i][j] = 2;
				}
				if(j>=9 && j<13 && i>=25 && i<= 27) {
					mundo[i][j] = 2;
				}
				if(j>=45 && j<49 && i>=3 && i<= 6) {
					mundo[i][j] = 2;
				}
				if(j>=30 && j<34 && i>=22 && i<= 24) {
					mundo[i][j] = 2;
				}
				if(j>=15 && j<21 && i>=12 && i<= 14) {
					mundo[i][j] = 2;
				}
			}
		}
		
		for(int i = 0; i<carro.size(); i++){
			mundo[carro.get(i).getX()][carro.get(i).getY()] = 4;
		}
		for(int i = 0; i<moto.size(); i++){
			mundo[moto.get(i).getX()][moto.get(i).getY()] = 3;
		}
		for(int i = 0; i < caminhao.size(); i++){
			mundo[caminhao.get(i).getX()][caminhao.get(i).getY()] = 5;
		}
		for(int i =0; i< 30; i++) {
			for(int j = 0; j< 60; j++) {
				System.out.print(mundo[i][j]);
			}
			System.out.println("");
		}
	}
	
	public int[][] getMundo(){
		return mundo;
		
	}
	
		
	private int mundo[][] =  new int[30][60];
	private int mapa;
	private int tamX;
	private int tamY;
	
	
	
	
}
