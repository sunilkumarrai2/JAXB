
package com.sunil.JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"name","zip"})
public class City {
private String name;
private String zip;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}

}
