package finals;

public class MetricToEnglishConverter implements ScaleConverter{
	private double distanceInCm;
	private double areaInCm;
	private double temperatureInCelsius;
	
	public MetricToEnglishConverter(double distanceInCm, double areaInCm, double temperatureInCelsius) {
		this.distanceInCm = distanceInCm;
		this.areaInCm = areaInCm;
		this.temperatureInCelsius = temperatureInCelsius;
	}
	
	@Override
	public double convertDistance(double distanceIn) {
		distanceIn = distanceInCm / 2.54;
		return distanceIn;
	}

	public double getDistanceInCm() {
		return distanceInCm;
	}

	public void setDistanceInCm(double distanceInCm) {
		this.distanceInCm = distanceInCm;
	}

	public double getAreaInCm() {
		return areaInCm;
	}

	public void setAreaInCm(double areaInCm) {
		this.areaInCm = areaInCm;
	}

	public double getTemperatureInCelsius() {
		return temperatureInCelsius;
	}

	public void setTemperatureInCelsius(double temperatureInCelsius) {
		this.temperatureInCelsius = temperatureInCelsius;
	}

	@Override
	public double convertArea(double areaIn) {
		areaIn = areaInCm / Math.pow(2.54, 2);
		return areaIn;
	}

	@Override
	public double convertTemperature(double tempIn) {
		tempIn = (temperatureInCelsius * (9/5) + 32);
		return tempIn;
	}
	
}
