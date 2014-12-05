package implementado;

public class ForecastTwoNews implements Observer, Display {
	private float temperature;
	private float pressao;
	private WeatherData weatherData;
	
	public ForecastTwoNews(WeatherData weatherData) {
		this.setWeatherData(weatherData);
		weatherData.addObserver(this);
	}
	
	public void update(float temperature, float pressao) {
		this.temperature = temperature;
		this.pressao = pressao;
		display();
	}
	@Override
	public void display(){
		System.out.printf("ForecastTwoNews: A temperatura é de : %f graus e a pressão é de %f pa\n", temperature, pressao);
	}

	public WeatherData getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

}
