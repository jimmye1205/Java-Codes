package finals;

public class finalDriver {
	public static void main(String[] args) {
		EnglishToMetricConverter emc1 = new EnglishToMetricConverter(5, 0,32);
		MetricToEnglishConverter mec1 = new MetricToEnglishConverter(5, 10, 0);
		System.out.println(mec1.convertArea(10) + " " + mec1.convertDistance(5) + " " + mec1.convertTemperature(0));
	}
}
