package finals;

public class EnglishToMetricConverter implements ScaleConverter {
	private double distanceInInches;
	private double areaInInches;
	private double temperatureOfFahrenheit;

	public EnglishToMetricConverter(double distanceInInches, double areaInInches, double temperatureOfFahrenheit) {
		this.distanceInInches = distanceInInches;
		this.areaInInches = areaInInches;
		this.temperatureOfFahrenheit = temperatureOfFahrenheit;
	}
	
	public double getDistanceInInches() {
		return distanceInInches;
	}

	public void setDistanceInInches(double distanceInInches) {
		this.distanceInInches = distanceInInches;
	}

	public double getAreaInInches() {
		return areaInInches;
	}

	public void setAreaInInches(double areaInInches) {
		this.areaInInches = areaInInches;
	}

	public double getTemperatureOfFahrenheit() {
		return temperatureOfFahrenheit;
	}

	public void setTemperatureOfFahrenheit(double temperatureOfFahrenheit) {
		this.temperatureOfFahrenheit = temperatureOfFahrenheit;
	}

	
	public double convertDistance(double distanceIn) {
		distanceIn = distanceInInches * 2.54;
		return distanceIn;
	}

	public double convertArea(double areaIn) {
		areaIn = (Math.pow(2.54, 2) * areaInInches);
		return areaIn;
	}

	
	public double convertTemperature(double tempIn) {
		tempIn = (temperatureOfFahrenheit - 32) * (5.0/9.0);
		return tempIn;
	}

}
