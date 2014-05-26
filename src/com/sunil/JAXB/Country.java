package com.sunil.JAXB;

import java.util.ArrayList;
import javax.xml.bind.annotation.*;

@XmlRootElement(namespace="com.sunil.JAX")
@XmlType(propOrder={"name","stateList"})
public class Country {
	
	private String name;
	private ArrayList<State> stateList;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement(name="state")
	public ArrayList<State> getStateList() {
		return stateList;
	}
	@XmlElementWrapper(name="States")
	public void setStateList(ArrayList<State> stateList) {
		this.stateList = stateList;
	}
}
