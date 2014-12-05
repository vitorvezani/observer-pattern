package implementado;

public class ForecastOneNews implements Observer, Display {
	private float temperature;
	private float pressao;
	private WeatherData weatherData;
	
	public ForecastOneNews(WeatherData weatherData) {
		this.setWeatherData(weatherData);
		weatherData.addObserver(this);
	}
	
	@Override
	public void update(float temperature, float pressao) {
		this.temperature = temperature;
		this.pressao = pressao;
		display();
	}
	@Override
	public void display(){
		System.out.printf("ForecastOneNews: A temperatura é de : %f graus e a pressão é de %f pa\n", temperature, pressao);
	}

	public WeatherData getWeatherData() {
		return weatherData;
	}

	public ForecastOneNews setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
		return this;
	}

}
