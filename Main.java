/** 
 * @author Lucas de Arruda Campos Simoes - codigo:CC3642 - RA: 22117022-8
 * 
 * 
 * 
 * 
 * */
package p1Final;
import java.util.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	
	public static void main(String[] args) {	
		Random gerador = new Random(); ///>  funcao para gerar numeros
		Mundo mundo = new Mundo();  
		
		ArrayList <Carro> carro = new ArrayList<>();
		ArrayList <Moto> moto = new ArrayList<>();
		ArrayList <Caminhao> caminhao = new ArrayList<>();
		for(int i = 0;i<10;i++){
			carro.add(new Carro(gerador.nextInt(30),gerador.nextInt(60)));
			moto.add(new Moto(gerador.nextInt(30),gerador.nextInt(60)));
			caminhao.add(new Caminhao(gerador.nextInt(30),gerador.nextInt(60)));
		}
		
		Timer timer = new Timer();
		final long SEG = (1000*1);
		
		TimerTask timerTask = new TimerTask(){
			@Override
			public void run(){
				System.out.println("carro:" + carro.size());
				System.out.println("moto:" + moto.size());
				System.out.println("caminhao:" + caminhao.size());
				mundo.Cria(moto, carro, caminhao);
				for(int i = 0; i < 10; i++){
					caminhao.get(i).move(1);
					carro.get(i).move(2);
					moto.get(i).move(3);
				}
				
				/*
				for(int i = 0; i < carro.size(); i++){
					for(int j = 0; j < moto.size(); j++){
						if(carro.get(i).getX() == moto.get(j).getX() && carro.get(i).getY() == moto.get(j).getY()){
							moto.remove(j);
						}
					}
				}
				for(int i = 0; i < carro.size(); i++){
					for(int j = 0; j < carro.size(); j++){
						if(carro.get(i).getX() == carro.get(j).getX() && carro.get(i).getY() == carro.get(j).getY()){
							carro.remove(j);
							carro.remove(i);
						}
					}
				}
				for(int i = 0; i < carro.size(); i++){
					for(int j = 0; j < caminhao.size(); j++){
						if(carro.get(i).getX() == caminhao.get(j).getX() && carro.get(i).getY() == caminhao.get(j).getY()){
							carro.remove(i);
						}
					}
				}
				for(int i = 0; i < caminhao.size(); i++){
					for(int j = 0; j < moto.size(); j++){
						if(caminhao.get(i).getX() == moto.get(j).getX() && caminhao.get(i).getY() == moto.get(j).getY()){
							moto.remove(j);
						}
					}
				}
				for(int i = 0; i < moto.size(); i++){
					for(int j = 0; j < moto.size(); j++){
						if(moto.get(i).getX() == moto.get(j).getX() && moto.get(i).getY() == moto.get(j).getY()){
							moto.remove(j);
							moto.remove(i);
						}
					}
				}
				for(int i = 0; i < caminhao.size(); i++){
					for(int j = 0; j < caminhao.size(); j++){
						if(caminhao.get(i).getX() == caminhao.get(j).getX() && caminhao.get(i).getY() == caminhao.get(j).getY()){
							caminhao.remove(j);
							caminhao.remove(i);
						}
					}
				}*/
				
			}
		};
		while(carro.size() != 0){
			timer.scheduleAtFixedRate(timerTask,0,SEG);
			}			
		}		
	}
	


		