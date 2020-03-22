package Jsoup_test;

public class SampleData {
	String name;
	String rate;
	String ThreeDayAverage;
	
	public SampleData(String name, String rate, String threeDayAverage) {
		this.name = name;
		this.rate = rate;
		this.ThreeDayAverage = threeDayAverage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getThreeDayAverage() {
		return ThreeDayAverage;
	}
	public void setThreeDayAverage(String threeDayAverage) {
		ThreeDayAverage = threeDayAverage;
	}
	@Override
	public String toString() {
		return this.name+" "+this.rate+" "+this.ThreeDayAverage;
	}
	
}
