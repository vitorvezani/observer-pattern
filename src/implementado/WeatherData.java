package implementado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeatherData implements Subject {
	private float temperatura;
	private float pressao;
	List<Observer> observers;
	
	public WeatherData(){
		this.temperatura = new Float(45);
		this.pressao = new Float(24);
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for (Iterator<Observer> iterator = observers.iterator(); iterator.hasNext();) {
			Observer observer = (Observer) iterator.next();
			observer.update(this.temperatura, this.pressao);
		}
		
	}
	
	public void setChangedAttributes(float temperatura, float pressao) {
		this.temperatura = temperatura;
		this.pressao = pressao;
		notifyObservers();
	}

}
