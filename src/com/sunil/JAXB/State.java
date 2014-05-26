
package com.sunil.JAXB;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"name","cityList"})
public class State {

	private String name;
	private ArrayList<City> cityList;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement(name="city")
	public ArrayList<City> getCityList() {
		return cityList;
	}
	@XmlElementWrapper(name="Cities")
	public void setCityList(ArrayList<City> cityList) {
		this.cityList = cityList;
	}

}
