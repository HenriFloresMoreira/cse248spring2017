package p2;

import java.util.Comparator;

public class Country implements Comparable<Country> {
	private String name;
	private double area;

	public Country(String name, double area) {
		super();
		this.name = name;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", area=" + area + "]";
	}

	@Override
	public int compareTo(Country o) {
//		return Double.compare(area, o.area);
		return name.compareTo(o.name);
	}

	
}
