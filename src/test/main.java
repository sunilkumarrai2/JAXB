package test;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sunil.JAXB.*;
public class main {

	private static final String BOOKSTORE_XML = "./bookstore-jaxb.xml";
	
	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		ArrayList<Country> countries=new ArrayList<Country>();
		
		City c1=new City();
		c1.setName("Gaya");c1.setZip("823001");
		City c2=new City();
		c1.setName("Patna");c1.setZip("82000");
		City c3=new City();
		c3.setName("Pune");c3.setZip("411021");
		City c4=new City();
		c4.setName("Mumbai");c4.setZip("41000");
		
		State s1=new State();
		s1.setName("Bihar");
		ArrayList<City> s1cities=new ArrayList<City>();
		s1cities.add(c1);s1cities.add(c2);
		s1.setCityList(s1cities);
		
		State s2=new State();
		s2.setName("Maharastra");
		ArrayList<City> s2cities=new ArrayList<City>();
		s2cities.add(c3);s2cities.add(c4);
		s2.setCityList(s2cities);
		
		Country coun=new Country();
		coun.setName("India");
		ArrayList<State> stateList=new ArrayList<State>();
		stateList.add(s1);stateList.add(s2);
		coun.setStateList(stateList);
		
		countries.add(coun);
		JAXBContext context =JAXBContext.newInstance(Country.class);
		Marshaller m=context.createMarshaller();
		
		 m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		 m.marshal(coun, new File(BOOKSTORE_XML));

	}

}
