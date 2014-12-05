package javaAPI;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temperatura;
	private float pressao;
	
	public WeatherData(){
		this.temperatura= new Float(45);
		this.pressao = new Float(24);
	}
	
	public void setChangedAttributes(float temperatura, float pressao) {
		this.setTemperatura(temperatura);
		this.setPressao(pressao);
		// Somente notifica os observadores se houver mudanca
		setChanged();
		notifyObservers();
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getPressao() {
		return pressao;
	}

	public void setPressao(float pressao) {
		this.pressao = pressao;
	}

}
