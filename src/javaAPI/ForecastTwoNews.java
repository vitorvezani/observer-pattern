package javaAPI;

import java.util.Observable;
import java.util.Observer;

public class ForecastTwoNews implements Observer, Display {
	private float temperature;
	private float pressao;
	private WeatherData weatherData;
	
	public ForecastTwoNews(WeatherData weatherData) {
		this.setWeatherData(weatherData);
		weatherData.addObserver(this);
	}
	
	@Override
	public void display(){
		System.out.printf("ForecastTwoNews: A temperatura é de : %f graus e a pressão é de %f pa\n", temperature, pressao);
	}

	public WeatherData getWeatherData() {
		return weatherData;
	}

	public ForecastTwoNews setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
		return this;
	}

	@Override
	public void update(Observable observer, Object arg) {
		if (observer instanceof WeatherData){
			WeatherData weatherData = (WeatherData) observer;
			this.weatherData = weatherData;
			this.temperature = weatherData.getTemperatura();
			this.pressao = weatherData.getPressao();
			display();
		}
		
	}

}
