package javaAPI;

public class MainClass {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		ForecastOneNews oneNews = new ForecastOneNews(weatherData);
		ForecastTwoNews twoNews = new ForecastTwoNews(weatherData);
		
		weatherData.setChangedAttributes(23, 42);
		
		weatherData.deleteObserver(oneNews);
		
		weatherData.setChangedAttributes(12, 34);
		
		weatherData.addObserver(oneNews);
		
		weatherData.setChangedAttributes(62, 367);

		weatherData.deleteObserver(twoNews);
		weatherData.deleteObserver(oneNews);
		
		weatherData.setChangedAttributes(12, 54);
		
	}
	
}
